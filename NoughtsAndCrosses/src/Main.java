import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;



public class Main implements ActionListener {
    private MainView ttt;
    private  JButton[] buttons;

    private JLabel playerUsername;

    private Random rand;

    private Boolean player1Turn;



    private Boolean gameOver;

    private Boolean player1Win;

    private Boolean player2Win;

    private JLabel statusLabel;

    private JButton resetButton;

    private JButton exitButton;

    private JPanel statsPanel;

    private JLabel playerXLabel;

    private JLabel playerOLabel;

    private JLabel drawLabel;
    private int player1Counter;

    private int player2Counter;

    private int draws;
    public Main(){
        ttt = new MainView();
        ttt.setTitle("Nought & Crosses");
        buttons = new JButton[9];
        rand = new Random();
        gameOver = false;
        player1Win = false;
        player2Win = false;
    }
    public void playGame(){//setting up the gui
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(new Color (40,40,40));
        header.setBounds(0,0,800,70);
        ttt.addCustomComponent(header);

        statusLabel = new JLabel("Status: Waiting");
        statusLabel.setBounds(270,45,370,130);
        statusLabel.setForeground(Color.GREEN);
        statusLabel.setFont(new Font("Ink Free",Font.BOLD,30));
        ttt.addCustomComponent(statusLabel);

        playerXLabel = new JLabel("Player X Stats");
        playerXLabel.setBounds(100,45,100,100);
        playerXLabel.setForeground(Color.GREEN);
        playerXLabel.setFont(new Font("Ink Free",Font.BOLD,40));

        playerUsername = new JLabel("Noughts & Crosses");
        header.add(playerUsername);
        playerUsername.setForeground(Color.GREEN);
        playerUsername.setFont(new Font("Ink Free",Font.BOLD,40));
        playerUsername.setBounds(250,20,500,50);

        JPanel buttonArea = new JPanel();
        buttonArea.setLayout(new GridLayout(3,3));
        buttonArea.setBackground(new Color(40,40,40));
        buttonArea.setBounds(270,130,300,300);
        for (int i = 0; i < 9; i++){
            JButton button = new JButton();
            button.setFocusable(false);
            button.setBackground(new Color (224,224,224));
            button.addActionListener(this);
            buttons[i] = button;
            buttonArea.add(button);
        }

        ttt.addCustomComponent(buttonArea);
        statsPanel = new JPanel();
        statsPanel.setLayout(null);
        statsPanel.setBounds(50,200,200,150);
        statsPanel.setBackground(new Color (40,40,40));
        ttt.addCustomComponent(statsPanel);

        playerXLabel = new JLabel("Player X Score: " + player1Counter);
        playerOLabel = new JLabel("Player O Score: " + player2Counter);
        drawLabel = new JLabel("    Draws: " + draws);
        playerXLabel.setForeground(Color.green);
        playerOLabel.setForeground(Color.green);
        drawLabel.setForeground(Color.green);
        playerXLabel.setFont(new Font("Ink Free",Font.BOLD,20));
        playerOLabel.setFont(new Font("Ink Free",Font.BOLD,20));
        drawLabel.setFont(new Font("Ink Free",Font.BOLD,20));

        statsPanel.add(playerXLabel);
        statsPanel.add(playerOLabel);
        statsPanel.add(drawLabel);

        playerXLabel.setBounds(10,0,250,100);
        playerOLabel.setBounds(10,40,250,100);
        drawLabel.setBounds(20,75,160,100);


        resetButton = new JButton("Reset");
        resetButton.setBounds(630,250,100,40);
        resetButton.setForeground(Color.GREEN);
        resetButton.setFont(new Font("Ink Free",Font.BOLD,30));
        resetButton.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        resetButton.setBackground(new Color (40,40,40));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        ttt.addCustomComponent(resetButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(630,380,100,40);
        exitButton.setForeground(Color.GREEN);
        exitButton.setFont(new Font("Ink Free",Font.BOLD,30));
        exitButton.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        exitButton.setBackground(new Color (40,40,40));
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);
        ttt.addCustomComponent(exitButton);




        ttt.set();
    }



    public void pickFirst(){//picking if player x or o goes first randomly
        if (rand.nextInt(2) == 0){
            statusLabel.setText("Status: Player X Turn");
            player1Turn = true;
        }
        else{
            statusLabel.setText("Status: Player O Turn");
            player1Turn = false;
        }
    }

    public void getWinner(){//win conditions
        if (buttons[0].getText().equals("X") && buttons[1].getText().equals("X") && buttons[2].getText().equals("X")){
            buttons[0].setBackground(Color.green);
            buttons[1].setBackground(Color.green);
            buttons[2].setBackground(Color.green);
            player1Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player X wins!");
            player1Counter++;
            playerXLabel.setText("Player X Score: " + player1Counter);
        }
        else if(buttons[0].getText().equals("X") && buttons[3].getText().equals("X") && buttons[6].getText().equals("X")){
            buttons[0].setBackground(Color.green);
            buttons[3].setBackground(Color.green);
            buttons[6].setBackground(Color.green);
            player1Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player X wins!");
            player1Counter++;
            playerXLabel.setText("Player X Score: " + player1Counter);

        }
        else if(buttons[0].getText().equals("X") && buttons[4].getText().equals("X") && buttons[8].getText().equals("X")){
            buttons[0].setBackground(Color.green);
            buttons[4].setBackground(Color.green);
            buttons[8].setBackground(Color.green);
            player1Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player X wins!");
            player1Counter++;
            playerXLabel.setText("Player X Score: " + player1Counter);

        }
        else if(buttons[2].getText().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("X")){
            buttons[2].setBackground(Color.green);
            buttons[5].setBackground(Color.green);
            buttons[8].setBackground(Color.green);
            player1Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player X wins!");
            player1Counter++;
            playerXLabel.setText("Player X Score: " + player1Counter);
        }
        else if(buttons[2].getText().equals("X") && buttons[4].getText().equals("X") && buttons[6].getText().equals("X")){
            buttons[2].setBackground(Color.green);
            buttons[4].setBackground(Color.green);
            buttons[6].setBackground(Color.green);
            player1Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player X wins!");
            player1Counter++;
            playerXLabel.setText("Player X Score: " + player1Counter);
        }
        else if(buttons[1].getText().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("X")){
            buttons[1].setBackground(Color.green);
            buttons[4].setBackground(Color.green);
            buttons[7].setBackground(Color.green);
            player1Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player X wins!");
            player1Counter++;
            playerXLabel.setText("Player X Score: " + player1Counter);
        }
        else if(buttons[6].getText().equals("X") && buttons[7].getText().equals("X") && buttons[8].getText().equals("X")){
            buttons[6].setBackground(Color.green);
            buttons[7].setBackground(Color.green);
            buttons[8].setBackground(Color.green);
            player1Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player X wins!");
            player1Counter++;
            playerXLabel.setText("Player X Score: " + player1Counter);
        }
        else if(buttons[3].getText().equals("X") && buttons[4].getText().equals("X") && buttons[5].getText().equals("X")){
            buttons[3].setBackground(Color.green);
            buttons[4].setBackground(Color.green);
            buttons[5].setBackground(Color.green);
            player1Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player X wins!");
            player1Counter++;
            playerXLabel.setText("Player X Score: " + player1Counter);
        }
        if (buttons[0].getText().equals("O") && buttons[1].getText().equals("O") && buttons[2].getText().equals("O")){
            buttons[0].setBackground(Color.green);
            buttons[1].setBackground(Color.green);
            buttons[2].setBackground(Color.green);
            player2Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player O wins!");
            player2Counter++;
            playerOLabel.setText("Player O Score: " + player2Counter);
        }
        else if(buttons[0].getText().equals("O") && buttons[3].getText().equals("O") && buttons[6].getText().equals("O")){
            buttons[0].setBackground(Color.green);
            buttons[3].setBackground(Color.green);
            buttons[6].setBackground(Color.green);
            player2Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player O wins!");
            player2Counter++;
            playerOLabel.setText("Player O Score: " + player2Counter);
        }
        else if(buttons[0].getText().equals("O") && buttons[4].getText().equals("O") && buttons[8].getText().equals("O")){
            buttons[0].setBackground(Color.green);
            buttons[4].setBackground(Color.green);
            buttons[8].setBackground(Color.green);
            player2Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player O wins!");
            player2Counter++;
            playerOLabel.setText("Player O Score: " + player2Counter);
        }
        else if(buttons[2].getText().equals("O") && buttons[5].getText().equals("O") && buttons[8].getText().equals("O")){
            buttons[2].setBackground(Color.green);
            buttons[5].setBackground(Color.green);
            buttons[8].setBackground(Color.green);
            player2Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player O wins!");
            player2Counter++;
            playerOLabel.setText("Player O Score: " + player2Counter);
        }
        else if(buttons[2].getText().equals("O") && buttons[4].getText().equals("O") && buttons[6].getText().equals("O")){
            buttons[2].setBackground(Color.green);
            buttons[4].setBackground(Color.green);
            buttons[6].setBackground(Color.green);
            player2Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player O wins!");
            player2Counter++;
            playerOLabel.setText("Player O Score: " + player2Counter);
        }
        else if(buttons[1].getText().equals("O") && buttons[4].getText().equals("O") && buttons[7].getText().equals("O")){
            buttons[1].setBackground(Color.green);
            buttons[4].setBackground(Color.green);
            buttons[7].setBackground(Color.green);
            player2Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player O wins!");
            player2Counter++;
            playerOLabel.setText("Player O Score: " + player2Counter);
        }
        else if(buttons[6].getText().equals("O") && buttons[7].getText().equals("O") && buttons[8].getText().equals("O")){
            buttons[6].setBackground(Color.green);
            buttons[7].setBackground(Color.green);
            buttons[8].setBackground(Color.green);
            player2Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player wins!");
            player2Counter++;
            playerOLabel.setText("Player O Score: " + player2Counter);
        }
        else if(buttons[3].getText().equals("O") && buttons[4].getText().equals("O") && buttons[5].getText().equals("O")){
            buttons[3].setBackground(Color.green);
            buttons[4].setBackground(Color.green);
            buttons[5].setBackground(Color.green);
            player2Win = true;
            gameOver = true;
            statusLabel.setText("Status: Player O wins!");
            player2Counter++;
            playerOLabel.setText("Player O Score: " + player2Counter);
        }
        else if(!buttons[0].getText().isEmpty() && !buttons[1].getText().isEmpty() && !buttons[2].getText().isEmpty() && !buttons[3].getText().isEmpty() && !buttons[4].getText().isEmpty() && !buttons[5].getText().isEmpty() && !buttons[6].getText().isEmpty() && !buttons[7].getText().isEmpty() && !buttons[8].getText().isEmpty()){
            if (!player1Win && !player2Win) {
                gameOver = true;
                statusLabel.setText("Status: It's a Draw!");
                draws++;
                drawLabel.setText("    Draws: " + draws);
            }
        }
    }

    public void resetGame(){//resets the board and picks a random starter
        for (JButton button : buttons){
            button.setText("");
            button.setBackground(new Color (224,224,224));
        }
        pickFirst();
        if (player1Turn){
            statusLabel.setText("Status: Player X Turn");
        }
        else{
            statusLabel.setText("Status: Player O Turn");
        }
        gameOver = false;
        player2Win = false;
        player1Win = false;
    }


    @Override
    public void actionPerformed(ActionEvent e) {//handles whenever a button in the grid is clicked.
        if (!gameOver) {
            for (int i = 0; i < buttons.length; i++) {
                if (e.getSource() == buttons[i]) {
                    if (!buttons[i].getText().isEmpty()) {
                        statusLabel.setText("Status: Invalid position");
                    } else {
                        if (player1Turn) {
                            buttons[i].setText("X");
                            buttons[i].setFont(new Font("MV Boli",Font.BOLD,80));                            buttons[i].setForeground(Color.RED);
                            buttons[i].setForeground(Color.BLUE);
                            player1Turn = false;
                            statusLabel.setText("Status: Player O Turn");
                            getWinner();

                        } else {
                            buttons[i].setText("O");
                            buttons[i].setFont(new Font("MV Boli",Font.BOLD,80));                            buttons[i].setForeground(Color.RED);
                            player1Turn = true;
                            statusLabel.setText("Status: Player X Turn");
                            getWinner();

                        }
                    }
                }
            }
        }//reset and exit buttons
        if (e.getSource() == resetButton){
            resetGame();
        }
        else if (e.getSource() == exitButton){
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            Main m = new Main();
            m.playGame();
            m.pickFirst();
        });
    }
}