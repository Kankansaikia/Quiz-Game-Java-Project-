
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to QuizQuest");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(5, 100, 730,400);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. The quiz consists of multiple-choice questions." + "<br><br>" +
                "2. Each question will have four answer options (A, B, C, D)." + "<br><br>" +
                "3. All the questions are compulsory." + "<br><br>" +
                "4. You will be awarded 10 points for every correct answer." + "<br><br>" +
                "5. No points are awarded for incorrect answers (0 points)" + "<br><br>" +
                "6. You will have 15 seconds to answer each question. If time runs out, no points will be awarded for that question." + "<br><br>" +
                "7. You must select one answer from the four provided options (A, B, C, D)." + "<br><br>" +
                "8. Once submitted you cannot change your response." + "<br><br>" +
                "9. At the end of the quiz, your total score will be calculated based on the number of correct answers." +"<br><br>"+
            "</html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}

