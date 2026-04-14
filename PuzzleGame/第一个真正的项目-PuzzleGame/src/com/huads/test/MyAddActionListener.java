package com.huads.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAddActionListener  implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("没想到你真的点了");
    }
}
