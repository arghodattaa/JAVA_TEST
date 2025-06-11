package rowFile;

public  abstract class Player {
    protected String playerName;
	protected int jNo;
	protected double price;

   public Player(){}

    public abstract void setPlayerAll(String playerName, int jNo, double price);

    public abstract void setPlayerName(String playerName);
	public abstract String getPlayerName();
	
	public abstract void setJNo(int jNo);
	public abstract int getJNo();
	
	public abstract void setPrice(double price);
	public abstract double getPrice();
    
    public abstract void showPlayer();
    public abstract String getPlayer();
    
}
