package Love1;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * 情绪代码创意编写大赛作品
 * 主题：情绪治愈、消解烦恼、美好期许
 * 作品名称：心情治愈站 - Mood Healer
 *
 * 功能说明：
 * 1. 用户可以输入自己的烦恼，程序给出温暖的回应
 * 2. 每日一句治愈语录
 * 3. 彩色心情选择器，根据心情变化背景色
 * 4. 呼吸灯效果放松心情
 *
 * @author 参赛者
 * @date 2026年5月
 */
public class MoodHealer {

    public static void main(String[] args) {
        // 在事件调度线程中启动GUI，确保线程安全
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new MoodHealerGUI().setVisible(true);
        });
    }
}

/**
 * 主界面GUI类
 */
class MoodHealerGUI extends JFrame {

    private JTextArea worryInputArea;
    private JTextArea responseArea;
    private JLabel quoteLabel;
    private JPanel mainPanel;
    private JPanel colorPanel;
    private JButton healButton;
    private JButton clearButton;
    private JButton breathButton;
    private Timer breathTimer;
    private float breathAlpha = 1.0f;
    private boolean isBreathing = false;

    // 治愈语录库
    private final String[] healingQuotes = {
            "✨ 你比你想象的要更坚强，更勇敢，更美好 ✨",
            "🌸 今天的烦恼，明天就会变成成长的故事 🌸",
            "💪 允许自己偶尔脆弱，那是为了积蓄更强大的力量 💪",
            "🌟 每一个今天都是新的开始，给自己一个微笑吧 🌟",
            "🌙 夜晚再长，黎明终会到来，请耐心等待 🌙",
            "💖 你值得被爱，首先是被你自己深爱 💖",
            "🌈 生活就像彩虹，风雨过后才有最美的色彩 🌈",
            "🍃 放下无法改变的，改变可以改变的，智慧就在其中 🍃",
            "🌻 向着阳光生长，阴影自然就在身后 🌻",
            "⭐ 你不是一个人，这世界上总有人在默默关心你 ⭐"
    };

    // 情绪回应库
    private final String[][] emotionalResponses = {
            {"焦虑", "压力大", "紧张"},
            {"💚 焦虑就像天空的乌云，它会来，也一定会走。深呼吸三次，感受当下的平静。",
                    "🧡 压力和紧张是身体在告诉你"+"需要休息了"+"，给自己一点时间和空间吧。",
                    "💛 紧张说明你在乎，这已经很棒了！试着把注意力放在呼吸上。"},

            {"难过", "伤心", "失落"},
            {"💙 允许自己难过，情绪需要被看见。给自己一个大大的拥抱吧。",
                    "💜 伤心是心灵在清理伤口，给它一点时间，它会慢慢愈合的。",
                    "🤍 失落的感觉会过去的，你内心有足够的力量重新站起来。"},

            {"愤怒", "生气", "烦躁"},
            {"❤️ 愤怒是保护自己的能量，但别让它烧伤了你自己。先停下来，深呼吸。",
                    "🧡 生气的时候，试着走一走，让情绪像风一样流过身体。",
                    "💛 烦躁像夏天的热浪，找个安静的地方，让自己冷却一下。"},

            {"孤独", "寂寞", "没人理解"},
            {"💚 孤独是成长的必经之路，你正在和自己成为最好的朋友。",
                    "💙 你的存在本身就是一种美好，有人正在世界的某个角落等着遇见你。",
                    "💜 孤独不可怕，可怕的是不愿与自己相处。试试写封信给自己吧。"},

            {"迷茫", "困惑", "不知道"},
            {"🤎 迷茫是黎明前的黑暗，每一步探索都是在照亮前方的路。",
                    "💖 困惑的时候，停下来听听内心的声音，答案一直在你心里。",
                    "💗 不知道也没关系，人生本来就是一个不断寻找答案的过程。"}
    };

    private Random random = new Random();

    public MoodHealerGUI() {
        initUI();
        startDailyQuote();
    }

    private void initUI() {
        setTitle("💝 心情治愈站 - 情绪代码创意作品 💝");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);

        // 创建主面板，使用渐变背景
        mainPanel = new JPanel(new BorderLayout(15, 15));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setContentPane(mainPanel);

        // 设置背景渐变色
        setBackgroundGradient();

        // 创建标题
        JLabel titleLabel = new JLabel("「 代码清零烦恼，编程书写美好 」", JLabel.CENTER);
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 22));
        titleLabel.setForeground(new Color(255, 105, 180));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // 中心区域
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.BOTH;

        // 每日治愈语录区域
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        gbc.weighty = 0.15;
        JPanel quotePanel = createQuotePanel();
        centerPanel.add(quotePanel, gbc);

        // 情绪输入区域
        gbc.gridy = 1;
        gbc.weighty = 0.25;
        JPanel inputPanel = createInputPanel();
        centerPanel.add(inputPanel, gbc);

        // 操作按钮区域
        gbc.gridy = 2;
        gbc.weighty = 0.1;
        JPanel buttonPanel = createButtonPanel();
        centerPanel.add(buttonPanel, gbc);

        // 治愈回应区域
        gbc.gridy = 3;
        gbc.weighty = 0.25;
        JPanel responsePanel = createResponsePanel();
        centerPanel.add(responsePanel, gbc);

        // 心情色彩区域
        gbc.gridy = 4;
        gbc.weighty = 0.15;
        JPanel colorPanel = createColorPanel();
        centerPanel.add(colorPanel, gbc);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // 底部装饰文字
        JLabel footerLabel = new JLabel("❤️ 5·25 我爱我 · 关爱自我 · 接纳自我 · 悦纳成长 ❤️", JLabel.CENTER);
        footerLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        footerLabel.setForeground(new Color(128, 128, 128));
        mainPanel.add(footerLabel, BorderLayout.SOUTH);
    }

    private void setBackgroundGradient() {
        // 设置渐变背景
        setContentPane(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                GradientPaint gp = new GradientPaint(
                        0, 0, new Color(255, 240, 245),
                        getWidth(), getHeight(), new Color(230, 240, 255)
                );
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        });
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setOpaque(false);
        setContentPane(mainPanel);
    }

    private JPanel createQuotePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(255, 182, 193), 2, true),
                "🌸 每日治愈语录 🌸",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("微软雅黑", Font.BOLD, 14),
                new Color(255, 105, 180)
        ));

        quoteLabel = new JLabel("", JLabel.CENTER);
        quoteLabel.setFont(new Font("楷体", Font.PLAIN, 16));
        quoteLabel.setForeground(new Color(100, 100, 100));
        quoteLabel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(quoteLabel, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(144, 238, 144), 2, true),
                "💭 倾诉你的烦恼 💭",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("微软雅黑", Font.BOLD, 14),
                new Color(60, 179, 113)
        ));

        worryInputArea = new JTextArea(5, 30);
        worryInputArea.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        worryInputArea.setLineWrap(true);
        worryInputArea.setWrapStyleWord(true);
        worryInputArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        worryInputArea.setText("在这里写下你的烦恼吧...\n\n例如：最近考试压力好大，有点焦虑...");
        worryInputArea.setForeground(Color.GRAY);

        worryInputArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (worryInputArea.getText().equals("在这里写下你的烦恼吧...\n\n例如：最近考试压力好大，有点焦虑...")) {
                    worryInputArea.setText("");
                    worryInputArea.setForeground(Color.BLACK);
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (worryInputArea.getText().trim().isEmpty()) {
                    worryInputArea.setText("在这里写下你的烦恼吧...\n\n例如：最近考试压力好大，有点焦虑...");
                    worryInputArea.setForeground(Color.GRAY);
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(worryInputArea);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panel.setOpaque(false);

        healButton = new JButton("💝 治愈我 💝");
        healButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
        healButton.setBackground(new Color(255, 182, 193));
        healButton.setForeground(Color.WHITE);
        healButton.setFocusPainted(false);
        healButton.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        healButton.addActionListener(new HealAction());

        clearButton = new JButton("🧹 清空思绪 🧹");
        clearButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
        clearButton.setBackground(new Color(176, 224, 230));
        clearButton.setForeground(Color.WHITE);
        clearButton.setFocusPainted(false);
        clearButton.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        clearButton.addActionListener(e -> {
            worryInputArea.setText("");
            responseArea.setText("");
            responseArea.append("✨ 思绪已清空，愿你内心平静 ✨\n");
        });

        breathButton = new JButton("🌊 呼吸放松 🌊");
        breathButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
        breathButton.setBackground(new Color(200, 162, 200));
        breathButton.setForeground(Color.WHITE);
        breathButton.setFocusPainted(false);
        breathButton.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        breathButton.addActionListener(e -> startBreathingExercise());

        panel.add(healButton);
        panel.add(clearButton);
        panel.add(breathButton);

        return panel;
    }

    private JPanel createResponsePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(255, 218, 185), 2, true),
                "🌟 治愈回应 🌟",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("微软雅黑", Font.BOLD, 14),
                new Color(255, 140, 0)
        ));

        responseArea = new JTextArea(6, 30);
        responseArea.setFont(new Font("楷体", Font.PLAIN, 15));
        responseArea.setLineWrap(true);
        responseArea.setWrapStyleWord(true);
        responseArea.setEditable(false);
        responseArea.setBackground(new Color(255, 250, 240));
        responseArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        responseArea.setText("💖 你好呀！在这里写下你的烦恼，我会给你温暖的回应 💖\n\n");

        JScrollPane scrollPane = new JScrollPane(responseArea);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createColorPanel() {
        colorPanel = new JPanel(new GridLayout(1, 6, 10, 10));
        colorPanel.setOpaque(false);
        colorPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(175, 238, 238), 2, true),
                "🎨 心情调色盘 - 点击改变心情色彩 🎨",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("微软雅黑", Font.BOLD, 12),
                new Color(72, 209, 204)
        ));

        Color[] colors = {
                new Color(255, 228, 225), // 温柔粉
                new Color(240, 255, 240), // 清新绿
                new Color(240, 248, 255), // 宁静蓝
                new Color(255, 255, 224), // 温暖黄
                new Color(230, 230, 250), // 梦幻紫
                new Color(255, 245, 238)  // 奶油白
        };

        String[] colorNames = {"🌸 温柔", "🍃 清新", "💙 宁静", "☀️ 温暖", "💜 梦幻", "🤍 纯净"};

        for (int i = 0; i < colors.length; i++) {
            final Color bgColor = colors[i];
            final String colorName = colorNames[i];
            JPanel colorBox = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    setBackground(bgColor);
                }
            };
            colorBox.setPreferredSize(new Dimension(80, 50));
            colorBox.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
            colorBox.setToolTipText(colorName);

            JLabel label = new JLabel(colorName, JLabel.CENTER);
            label.setFont(new Font("微软雅黑", Font.PLAIN, 10));
            colorBox.setLayout(new BorderLayout());
            colorBox.add(label, BorderLayout.CENTER);

            colorBox.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    mainPanel.setBackground(bgColor);
                    responseArea.append("\n🎨 你选择了" + colorName + "心情，希望这份色彩能带给你平静 🎨\n");
                    // 自动滚动到底部
                    responseArea.setCaretPosition(responseArea.getDocument().getLength());
                }
            });

            colorPanel.add(colorBox);
        }

        return colorPanel;
    }

    /**
     * 治愈按钮的响应事件
     */
    private class HealAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String worry = worryInputArea.getText().trim();

            if (worry.isEmpty() || worry.equals("在这里写下你的烦恼吧...\n\n例如：最近考试压力好大，有点焦虑...")) {
                responseArea.append("\n💝 没关系，即使没有具体的烦恼，也请记得要好好爱自己哦！\n");
                responseArea.append("💝 " + healingQuotes[random.nextInt(healingQuotes.length)] + "\n");
            } else {
                // 分析烦恼内容并给出回应
                String response = analyzeAndRespond(worry);
                responseArea.append("\n📝 你的烦恼：" + (worry.length() > 50 ? worry.substring(0, 50) + "..." : worry) + "\n");
                responseArea.append(response + "\n");

                // 添加额外治愈语录
                if (random.nextBoolean()) {
                    responseArea.append("✨ " + healingQuotes[random.nextInt(healingQuotes.length)] + " ✨\n");
                }
            }

            // 添加呼吸提醒
            responseArea.append("\n💨 试着深呼吸三次：吸气... 呼气... 感受此刻的平静 💨\n");
            responseArea.append("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

            // 自动滚动到底部
            responseArea.setCaretPosition(responseArea.getDocument().getLength());

            // 播放治愈提示音效（简单的蜂鸣声，表示回应完成）
            Toolkit.getDefaultToolkit().beep();
        }

        private String analyzeAndRespond(String text) {
            String lowerText = text.toLowerCase();

            // 匹配情绪关键词
            for (String[] emotionGroup : emotionalResponses) {
                for (String keyword : emotionGroup) {
                    if (lowerText.contains(keyword)) {
                        // 返回对应的治愈回应（随机选择组内的回应，排除关键词本身）
                        int responseIndex = random.nextInt(emotionGroup.length - 1) + 1;
                        return emotionGroup[responseIndex];
                    }
                }
            }

            // 默认回应
            String[] defaultResponses = {
                    "💖 感谢你愿意分享你的感受。无论遇到什么，都请记得你并不孤单。",
                    "💖 每一种情绪都值得被看见和接纳，你已经很棒了！",
                    "💖 生活总有起伏，但你的内心有着想象不到的韧性。",
                    "💖 今天也要好好爱自己，你是独一无二的存在。"
            };

            return defaultResponses[random.nextInt(defaultResponses.length)];
        }
    }

    /**
     * 启动每日治愈语录（定时更新）
     */
    private void startDailyQuote() {
        // 显示随机治愈语录
        updateQuote();

        // 每小时更换一条语录
        Timer quoteTimer = new Timer(3600000, e -> updateQuote());
        quoteTimer.start();
    }

    private void updateQuote() {
        String quote = healingQuotes[random.nextInt(healingQuotes.length)];
        quoteLabel.setText(quote);
    }

    /**
     * 呼吸放松练习 - 带动画效果
     */
    private void startBreathingExercise() {
        if (isBreathing) {
            breathTimer.stop();
            isBreathing = false;
            breathButton.setText("🌊 呼吸放松 🌊");
            breathButton.setBackground(new Color(200, 162, 200));
            responseArea.append("\n🏁 呼吸练习结束，愿你内心平静 🏁\n");
            return;
        }

        isBreathing = true;
        breathButton.setText("⏸️ 停止练习 ⏸️");
        breathButton.setBackground(new Color(255, 99, 71));

        responseArea.append("\n🌊 开始呼吸放松练习 🌊\n");
        responseArea.append("💨 吸气... 保持... 呼气... 保持...\n");

        breathTimer = new Timer(3000, new ActionListener() {
            int breathCount = 0;
            String[] breathPhases = {"💨 深深吸气... 感受空气充满身体",
                    "⏸️ 屏住呼吸... 感受内在的平静",
                    "🌬️ 缓缓呼气... 释放所有紧张",
                    "⏸️ 保持空杯... 感受轻松"};

            @Override
            public void actionPerformed(ActionEvent e) {
                if (breathCount >= 8) { // 完成2个完整呼吸循环
                    breathTimer.stop();
                    isBreathing = false;
                    breathButton.setText("🌊 呼吸放松 🌊");
                    breathButton.setBackground(new Color(200, 162, 200));
                    responseArea.append("\n✨ 呼吸练习完成！愿你心情舒畅 ✨\n");
                    responseArea.setCaretPosition(responseArea.getDocument().getLength());
                } else {
                    String phase = breathPhases[breathCount % 4];
                    responseArea.append(phase + "\n");
                    responseArea.setCaretPosition(responseArea.getDocument().getLength());
                    breathCount++;
                }
            }
        });
        breathTimer.start();
    }
}

/**
 * 作品心得与说明
 *
 * 【创作理念】
 * 本作品围绕“情绪治愈、消解烦恼、美好期许”的主题展开，
 * 贴合525“我爱我”关爱自我的理念。
 *
 * 【作品特色】
 * 1. 互动性：用户可以直接输入烦恼，获得个性化的情感回应
 * 2. 治愈性：内置丰富的治愈语录库和情绪回应库
 * 3. 趣味性：心情调色盘让用户通过色彩调节情绪
 * 4. 实用性：呼吸放松练习帮助用户缓解压力
 *
 * 【技术实现】
 * - 使用Java Swing构建图形界面
 * - 实现情绪关键词智能匹配
 * - 定时器实现语录轮换和呼吸动画
 * - 渐变背景和圆角边框提升视觉体验
 *
 * 【自我感悟】
 * 通过编程创作这个作品，我深刻体会到：
 * 技术不仅是冰冷的代码，也可以传递温暖和关怀。
 * 希望这个小小的程序能帮助到需要情绪支持的同学，
 * 也希望大家都能学会关爱自己、接纳自己。
 *
 * 525，我爱我，从今天开始，好好爱自己！
 */
