package rowOperation;
import rowFile.*;
public class PlayerOperation extends Player {
    public PlayerOperation(){}
public  void setPlayerAll(String playerName, int jNoS, double price){
    this.playerName = playerName;
    this.jNo = jNo;
    this.price = price;
}


    public void setPlayerName(String playerName){
               this.playerName = playerName;
    }
	public String getPlayerName(){
            return playerName;
    }
	
	public  void setJNo(int jNo){
        this.jNo = jNo;
    }
	public  int getJNo(){
        return jNo;
    }
	
	public void setPrice(double price){
        this.price = price;
    }
	public double getPrice(){
        return price;
    }
    public void showPlayer(){
		System.out.println("Player Name: "+playerName);
		System.out.println("Player J. No: "+jNo);
		System.out.println("Price: "+price+" USD");
	}
    public String getPlayer(){
		return  "Player Name: "+playerName+"\n"+"Jersey No: "+jNo+"\n"+"Price: "+price+" USD "+"\n";
	}
}
