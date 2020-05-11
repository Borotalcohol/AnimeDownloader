package com.tuxdave;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;

public class DownloadSelector extends JFrame {
    private JPanel panel1;
    private JFileChooser jFolderChooser;

    private String path = "";

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        jFolderChooser = new JFileChooser();
        jFolderChooser.setDialogType(0);
        panel1.add(jFolderChooser, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    {
        add(panel1);
        jFolderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jFolderChooser.setAcceptAllFileFilterUsed(false);
        jFolderChooser.setDialogTitle("Seleziona la cartella Per il download degli episodi...");
    }

    public String getPath() {
        if (jFolderChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            path = jFolderChooser.getSelectedFile().toString();
            setVisible(false);
        }
        jFolderChooser.show(false);
        return path;
    }

}
