import javax.swing.*;

public class snake {
    
    public static void main(String[] args){

        

        JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        snake_graphics snake_output = new snake_graphics(frame.getWidth()-50, frame.getHeight()-50);
            frame.add(snake_output);
        

    }

}
