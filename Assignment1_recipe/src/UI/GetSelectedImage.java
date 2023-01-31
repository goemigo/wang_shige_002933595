/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author emi
 */
public class GetSelectedImage {
    
    private JFileChooser browseImage;
    
    
    public Image getSelectedImage(JLabel label){
        
        browseImage = new JFileChooser();
        Image image = null;
        //filter image extensions
        FileNameExtensionFilter extFilter = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        browseImage.addChoosableFileFilter(extFilter);
        
        int showOpenDialog = browseImage.showOpenDialog(null);
        if (showOpenDialog == JFileChooser.APPROVE_OPTION){
            File selectedImage = browseImage.getSelectedFile();
            String selectedImagePath = selectedImage.getAbsolutePath();
            ImageIcon ii = new ImageIcon(selectedImagePath);
            image = ii.getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        }
        return image;
    } 
}
