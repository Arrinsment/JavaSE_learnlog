import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

/**
 * 春韵繁花 · 电子鲜花
 * 动态绽放的春日繁花，使用 Java Swing 实现
 * 适合 ACM 竞技社 "码绘春光" 活动
 */
public class DigitalFlower extends JPanel implements Runnable {

    private float angle = 0;
    private float petalScale = 0.6f;
    private boolean growing = true;
    private final Random random = new Random();

    public DigitalFlower() {
        setBackground(new Color(20, 30, 45)); // 夜空暮色背景
        setPreferredSize(new Dimension(800, 700));
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            angle += 0.03;
            if (growing) {
                petalScale += 0.008;
                if (petalScale >= 1.0) growing = false;
            } else {
                petalScale -= 0.004;
                if (petalScale <= 0.6) growing = true;
            }
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // 1. 柔和光晕背景
        RadialGradientPaint bgGlow = new RadialGradientPaint(
                centerX, centerY, 350,
                new float[]{0f, 0.6f, 1f},
                new Color[]{new Color(60, 40, 70), new Color(30, 25, 50), new Color(15, 20, 35)}
        );
        g2d.setPaint(bgGlow);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // 2. 飘落的春日花瓣粒子
        drawFloatingPetals(g2d);

        // 3. 花茎和叶子
        drawStemAndLeaves(g2d, centerX, centerY);

        // 4. 主花 — 动态多层渐变花瓣
        drawMainFlower(g2d, centerX, centerY);

        // 5. 花蕊与星光点缀
        drawStamenAndSparkles(g2d, centerX, centerY);

        // 6. 标题文字
        drawTitle(g2d);
    }

    private void drawStemAndLeaves(Graphics2D g2d, int cx, int cy) {
        // 花茎
        QuadCurve2D stem = new QuadCurve2D.Float(
                cx, cy + 40,
                cx - 20, cy + 150,
                cx - 5, cy + 260
        );
        g2d.setStroke(new BasicStroke(12, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(new Color(34, 139, 34));
        g2d.draw(stem);

        // 叶子
        g2d.setColor(new Color(60, 179, 113));
        Path2D leaf1 = new Path2D.Float();
        leaf1.moveTo(cx - 15, cy + 120);
        leaf1.quadTo(cx - 55, cy + 100, cx - 70, cy + 150);
        leaf1.quadTo(cx - 45, cy + 140, cx - 15, cy + 130);
        g2d.fill(leaf1);

        Path2D leaf2 = new Path2D.Float();
        leaf2.moveTo(cx + 10, cy + 170);
        leaf2.quadTo(cx + 50, cy + 150, cx + 65, cy + 200);
        leaf2.quadTo(cx + 40, cy + 190, cx + 10, cy + 180);
        g2d.fill(leaf2);
    }

    private void drawMainFlower(Graphics2D g2d, int cx, int cy) {
        int petalCount = 8;
        double step = 2 * Math.PI / petalCount;

        for (int i = 0; i < petalCount; i++) {
            double rad = i * step + angle;
            double px = cx + 45 * Math.cos(rad);
            double py = cy - 20 + 45 * Math.sin(rad);

            // 动态缩放花瓣大小
            double currentScale = petalScale * (0.8 + 0.2 * Math.sin(angle * 2 + i));
            int petalW = (int) (50 * currentScale);
            int petalH = (int) (80 * currentScale);

            // 渐变色花瓣
            float hue = 0.08f + (float) (Math.sin(angle + i) * 0.04f);
            Color petalColor = Color.getHSBColor(hue, 0.85f, 1f);
            RadialGradientPaint petalGrad = new RadialGradientPaint(
                    (float) px, (float) py, petalW / 2f,
                    new float[]{0f, 0.7f, 1f},
                    new Color[]{petalColor, petalColor.darker(), new Color(255, 200, 180)}
            );
            g2d.setPaint(petalGrad);

            // 椭圆形花瓣
            Ellipse2D petal = new Ellipse2D.Float(
                    (float) px - petalW / 2f,
                    (float) py - petalH / 2f,
                    petalW, petalH
            );
            g2d.fill(petal);
            // 花瓣边缘高光
            g2d.setColor(new Color(255, 255, 200, 100));
            g2d.setStroke(new BasicStroke(1.5f));
            g2d.draw(petal);
        }

        // 第二层小花瓣 (增加繁花感)
        for (int i = 0; i < 12; i++) {
            double rad = i * Math.PI / 6 + angle * 1.2;
            double px = cx + 28 * Math.cos(rad);
            double py = cy - 15 + 28 * Math.sin(rad);
            int size = 25;
            g2d.setColor(new Color(255, 180, 210, 200));
            Ellipse2D smallPetal = new Ellipse2D.Float((float) px - size / 2f, (float) py - size / 2f, size, size);
            g2d.fill(smallPetal);
        }
    }

    private void drawStamenAndSparkles(Graphics2D g2d, int cx, int cy) {
        // 花蕊
        g2d.setColor(new Color(255, 215, 0));
        for (int i = 0; i < 30; i++) {
            double rad = random.nextDouble() * 2 * Math.PI;
            double radLen = random.nextDouble() * 20;
            int x = cx + (int) (radLen * Math.cos(rad));
            int y = cy - 10 + (int) (radLen * Math.sin(rad));
            g2d.fillOval(x, y, 3, 3);
        }
        // 中心亮点
        RadialGradientPaint core = new RadialGradientPaint(
                cx, cy - 8, 18,
                new float[]{0f, 0.6f, 1f},
                new Color[]{Color.WHITE, new Color(255, 220, 100), new Color(255, 160, 60)}
        );
        g2d.setPaint(core);
        g2d.fillOval(cx - 12, cy - 20, 24, 24);

        // 动态星光
        g2d.setColor(new Color(255, 255, 200, 180));
        for (int i = 0; i < 12; i++) {
            double offX = 65 * Math.cos(angle * 2 + i);
            double offY = 65 * Math.sin(angle * 2 + i);
            g2d.fillOval(cx + (int) offX - 2, cy - 18 + (int) offY - 2, 4, 4);
        }
    }

    private void drawFloatingPetals(Graphics2D g2d) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 25; i++) {
            float x = (float) (50 + (i * 31) % 750);
            float y = (float) ((time / 40 + i * 103) % 680);
            g2d.setColor(new Color(255, 180, 200, 180));
            g2d.fillOval((int) x, (int) y, 6, 8);
        }
    }

    private void drawTitle(Graphics2D g2d) {
        g2d.setFont(new Font("楷体", Font.BOLD, 28));
        g2d.setColor(new Color(255, 240, 180));
        String title = "🌸 春韵繁花 · 码绘春光 🌸";
        FontMetrics fm = g2d.getFontMetrics();
        int tw = fm.stringWidth(title);
        g2d.drawString(title, (getWidth() - tw) / 2, 60);

        g2d.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        g2d.setColor(new Color(220, 220, 150));
        String subtitle = "Digital Spring Blossom | ACM 竞技社";
        tw = g2d.getFontMetrics().stringWidth(subtitle);
        g2d.drawString(subtitle, (getWidth() - tw) / 2, 630);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("🌸 春韵繁花 · 电子鲜花作品 🌸");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new DigitalFlower());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}