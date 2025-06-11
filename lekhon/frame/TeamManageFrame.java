package frame;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import rowFile.*;
import rowOperation.*;

public class TeamManageFrame extends JFrame implements ActionListener{
 
    Team[] teams = new TeamOperation[100];
    JButton addPlayer1, creatTeam1 , submit;
    JTextField teamName1;
    JTextField player1 , playerPrice1, playerJP1, tempTeam1;

    JTextField removePlayerName1, removePlayerTeam1;
    JButton removeBoton;
     JTextArea console;
    public TeamManageFrame(){
       super("Cricket Team Manager ");
    this.setSize(1200,900);
    this.setLocation(500,100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setIconImage(new ImageIcon("C:/Users/USER/Desktop/lekhon/image/icon.png").getImage());
    this.setLayout(null);
    this.getContentPane().setBackground(new Color(12,183,138));
      
     

     JLabel title = new JLabel("Cricket Team Manage");
     title.setFont( new Font("Arial", Font.BOLD, 34));
     title.setBounds(420,0,400,30);
     
     this.add(title);

     JLabel teamLabel = new JLabel("Create New Team");
     teamLabel.setFont( new Font("Arial", Font.BOLD, 20));
     teamLabel.setBounds(10,60,200,20);
     this.add(teamLabel);
     



     JLabel teamName = new JLabel("Enter Team Name : ");
     teamName.setFont( new Font("Arial",Font.CENTER_BASELINE, 14));
     teamName.setBounds(10,100,150,20);
     this.add(teamName);

     teamName1= new JTextField();
     teamName1.setBounds(160,100,150,20);
     this.add(teamName1);

     creatTeam1 = new JButton("CREAT TEAM");
     creatTeam1.setBounds(160, 130, 150, 20);
     creatTeam1.addActionListener(this);
     this.add(creatTeam1);

     

     JLabel addPlayer = new JLabel(" Add Player your one Team.");
     addPlayer.setBounds(30,160,400,20);
     addPlayer.setFont( new Font("Arial", Font.CENTER_BASELINE,16));
     this.add(addPlayer);


     JLabel tempTeam = new JLabel("Wright you Team name");
     tempTeam.setBounds(10,190,150,20);
     this.add(tempTeam);

     tempTeam1 = new JTextField();
     tempTeam1.setBounds(160,190,150,20);
     this.add(tempTeam1);


     JLabel player = new JLabel("Enter player Name : ");
     player.setFont( new Font("Arial",Font.CENTER_BASELINE, 14));
     player.setBounds(10,215,150,20);
     this.add(player);

     player1 = new JTextField();
     player1.setBounds(160,215,150,20);
     this.add(player1);


     JLabel playerPrice = new JLabel("Enter player price : ");
     playerPrice.setFont( new Font("Arial",Font.CENTER_BASELINE, 14));
     playerPrice.setBounds(10,240,150,20);
     this.add(playerPrice);

     playerPrice1 = new JTextField();
     playerPrice1.setBounds(160,240,150,20);
     this.add(playerPrice1);

     JLabel playerJP = new JLabel("Jersey Number : ");
     playerJP.setFont( new Font("Arial",Font.CENTER_BASELINE, 14));
     playerJP.setBounds(10,265,150,20);
     this.add(playerJP);

      playerJP1 = new JTextField();
     playerJP1.setBounds(160,265,150,20);
     this.add(playerJP1);
     
     addPlayer1 = new JButton("ADD");
     addPlayer1.setBounds(100,300,80,20);
     addPlayer1.addActionListener(this);
     this.add(addPlayer1);

     console = new JTextArea("                              ****CONSOLE****\n");
     console.setEditable(false);
     console.setBackground(Color.BLACK);
     console.setForeground(Color.GREEN);
     console.setFont(new Font("Monospaced", Font.PLAIN, 14));
     
     JScrollPane scrollPane = new JScrollPane(console);
     scrollPane.setBounds(400,100,600,300);
     this.add(scrollPane, BorderLayout.CENTER);
    
     
    submit = new JButton("SUBMIT!");
    submit.setBounds(100,350,80,20);
    this.add(submit);
    submit.addActionListener(this);

     JLabel removePlayer = new JLabel("remove player");
     removePlayer.setBounds(10,400,200,20);
     this.add(removePlayer);



     JLabel removePlayerTeam = new JLabel("Enter team name");
      removePlayerTeam.setBounds(10,425,200,20);
     this.add(removePlayerTeam);
     
     removePlayerTeam1= new JTextField();
     removePlayerTeam1.setBounds(160,425,150,20);
     this.add(removePlayerTeam1);



     JLabel removePlayerName = new JLabel("Enter Player Name");
     removePlayerName.setBounds(10,450,200,20);
     this.add(removePlayerName);

     removePlayerName1= new JTextField();
     removePlayerName1.setBounds(160,450,150,20);
     this.add(removePlayerName1);
     

     removeBoton = new JButton("REMAOVE");
     removeBoton.setBounds(100,500,100,20);
     removeBoton.addActionListener(this);
     this.add(removeBoton);
     
     
      JOptionPane.showMessageDialog(this, "Sir , You are ready to creat a Crecket team!");
     //removePlayer.setBounds();


     /*ImageIcon originalIcon = new ImageIcon("C:/Users/USER/Desktop/lekhon/image/teamimage.png");
     Image scaledImage = originalIcon.getImage().getScaledInstance(70, 60, Image.SCALE_SMOOTH);
     ImageIcon resizedIcon = new ImageIcon(scaledImage);

     JLabel teamImage = new JLabel(resizedIcon);
     teamImage.setBounds(100, 40, 150, 75); // Matching the resized dimensions
     this.add(teamImage);*/
    
     /*ImageIcon originalIcon2 = new ImageIcon("C:/Users/USER/Desktop/lekhon/image/creatTeam.png");
     Image scaledImage2 = originalIcon2.getImage().getScaledInstance(100, 20, Image.SCALE_SMOOTH);
     ImageIcon resizeIcon2 = new ImageIcon(scaledImage2);
    
    JButton teamCreateTeamButton = new JButton(resizeIcon2);
    teamCreateTeamButton.setBounds(280,40,100,20);
    teamCreateTeamButton.addActionListener(this);
    this.add(teamCreateTeamButton);

    JLabel teamNoLabel = new JLabel("Team No.");
    teamNoLabel.setBounds(10,80,150,30);
    JTextField createTeamTextField = new JTextField("");
    createTeamTextField.setBounds(160,80,150,30);


    JLabel teamNameLabel = new JLabel("team Name");
    teamNameLabel.setBounds(10,120,150,30);
    JTextField teamNameTextField = new JTextField("");
    teamNameTextField.setBounds(160,120,150,30);
*/
    this.revalidate();
    this.repaint();
    this.setVisible(true);
    }

   public void actionPerformed(ActionEvent e){
           String teamName2;
          if( e.getSource() == creatTeam1){
            creatTeam1.setBackground(Color.GREEN);
                    teamName2 = teamName1.getText();
                  int a= 0;
                  Boolean chak = true;
                  int i;
                  for(  i = 0; i<100; i++){
                    if(teams[i] == null ){
                        teams[i] = new TeamOperation();
                        
                        chak = false;
                        if( a>0){
                            teamName2 += String.valueOf(a);
                            JOptionPane.showMessageDialog(this, "same team name ,\\n" +" so we change the  name  and the new team name " + teamName2+
                                                            " ");
                            //console.append("same team name ,\n so we change the  name , and the new team name " + teamName2);
                        }
                        JOptionPane.showMessageDialog(this, "Team creak!");
                        teams[i].setTeamName(teamName2);
                        break;
                    }
                    
                    if( teams[i].getTeamName() == teamName2){
                        a++;
                    }
                  }
                  //creatTeam1.setBackground(Color.WHITE);
                  teamName1.setText("");
                  this.add(teamName1);
                   if( chak){
                       JOptionPane.showMessageDialog((this), "No space for new team");
                        //console.append("No space for new team\n");
                        return;
                    }
                      try {
                                      FileWriter writer = new FileWriter("C:/Users/USER/Desktop/lekhon/textText.txt");
                                      
                                      writer.write( teamName2+ "\n");
                                               writer.close();
                                       System.out.println("Data successfully written to the file.");
                                       } catch (IOException ex) {
                                        JOptionPane.showMessageDialog(this, "An error occurred: , on Text file\n" + ex);
                                      //System.out.println("An error occurred: " + e.getMessage());
                                   } 

                    creatTeam1.setText("YOU HAVE A TREAM");
                    console.append("creating a team , teame name : "+ teamName2+"\n");
                    tempTeam1.setText(teamName2);
                    tempTeam1.setBackground(Color.GREEN);

          }



          if( e.getSource() == addPlayer1 || e.getSource() == submit){
            System.out.println("ok");
                 teamName2 = tempTeam1.getText();
                  Boolean chak = true, error = false;
                  PlayerOperation p1;
                  int p1Team_index = 0, p1_index = 0;
             for( int i = 0; i<100; i++){
             
                    if( teams[i].getTeamName().equals(teamName2)){
                               chak = false;
                        p1Team_index = i;
                     
                        String player2 = player1.getText();
                         console.append("Add a player in "+ teamName2 + "team\n");
                         Double playerPrice2=0.0 ;
                        try{
                       playerPrice2 =   Double.parseDouble(playerPrice1.getText() );
                  
                        console.append(("Add Playear Name : " + player2 + "\n"));
                       } catch (NumberFormatException ex){
                        error = true;
                       console.append("Error: Invalid input format,Playear Name .\n");
                      }
                       int playerJP2=0;
                      try {
                        playerJP2 = Integer.parseInt(playerJP1.getText());
                       console.append(("Add Playear JS no : " + playerJP2 + "\n"));
                     }
                      catch(NumberFormatException ex){
                         error = true;
                     console.append("Error: Invalid input format, JS no.\n");
                     }
                     if (player2.isEmpty()) {
                       error = true;
                       JOptionPane.showMessageDialog(this, "Player name cannot be empty.");
                       //console.append("Error: Player name cannot be empty.\n");
                     
                     }
                     if( !error){
                                p1 = new PlayerOperation();
                                 p1.setPlayerAll(player2, playerJP2, playerPrice2 );
                                    try {
                                      FileWriter writer = new FileWriter("C:/Users/USER/Desktop/lekhon/textText.txt");
                                      
                                      writer.write(player2 + playerJP2 + playerPrice2+ "\n");
                                               writer.close();
                                       System.out.println("Data successfully written to the file.");
                                       } catch (IOException ex) {
                                        JOptionPane.showMessageDialog(this, "An error occurred: , on Text file\n" + ex);
                                      //System.out.println("An error occurred: " + e.getMessage());
                                   }      



                                //teams[p1_index].setPlayerName(player2);
                                JOptionPane.showMessageDialog(this, " Thank you !\n all information is a player  ");
                                ((TeamOperation) teams[p1Team_index]).setPlayers( p1);
                        break;
 
                     }
                  
                }
                   
                }
                if( chak ){
                    JOptionPane.showMessageDialog(this, "No Team mach this name");
                    //console.append("No Team mach this name");
                }
                
             
                  player1.setText("");
                  this.add(player1);
                  playerJP1.setText("");
                  this.add(playerJP1);
                  playerPrice1.setText("");
                  this.add(playerPrice1);

                }

                if( e.getSource() == submit ){
                  JOptionPane.showMessageDialog(this, "Thank you sir! \n Creat a team and add palyer");
                 creatTeam1.setText("CREAT A TREAM");
                 creatTeam1.setBackground(Color.WHITE);
                 this.add(creatTeam1);
                 tempTeam1.setText("");
                 tempTeam1.setBackground(Color.WHITE);
                 this.add(tempTeam1);

                }



              
                if( e.getSource() == removeBoton){
                  String s1 = removePlayerTeam1.getText();
                  String s2 = removePlayerName1.getText();
                  for( int i = 0; i<100; i++){
                    if( teams[i].getTeamName().equals(s1)){
                      int t = teams[i].getIndex(s2) ;
                         if(  ( t) >=0 ){
                                 JOptionPane.showMessageDialog(this, "remove palayer");
                         }
                         else{
                           JOptionPane.showMessageDialog(this, "No player have this name , \nin this team");
                         }
                    }
                  }
                  removePlayerName1.setText("");
                  this.add(removePlayerName1);
                  removePlayerTeam1.setText("");
                  this.add(removePlayerTeam1);
                }
                  //console.append("creating a team , teame name : "+ teamName2+"\n");
                  /*String player2 = player1.getText();
                  console.append("Add a player in "+ teamName2 + "team\n");
                  Double playerPrice2=0.0 ;
                  try{
                       playerPrice2 =   Double.parseDouble(playerPrice1.getText() );
                  
                   console.append(("Add Playear Name : " + player2 + "\n"));
                  } catch (NumberFormatException ex){
                    console.append("Error: Invalid input format,Playear Name .\n");
                  }
                  int playerJP2=0;
                  try {
                     playerJP2 = Integer.parseInt(playerJP1.getText());
                    console.append(("Add Playear JS no : " + playerJP2 + "\n"));
                  }
                  catch(NumberFormatException ex){
                     console.append("Error: Invalid input format, JS no.\n");
                  }
                  if (player2.isEmpty()) {
                    console.append("Error: Player name cannot be empty.\n");
                   return;
                  }
                   Player p1 = new PlayerOperation();
                 p1.setPlayerAll(player2, playerJP2, playerPrice2 );*/
          
                
    }

                
    
                  
          }
 
   
