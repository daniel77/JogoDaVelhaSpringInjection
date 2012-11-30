package jogovelha;

public class Casa {

	public Casa(Tile tile) {
		super();
		this.tile = tile;
	}

	private Tile tile;
	
	
	@Override
	public String toString() {
	    if(tile.equals(Tile.BOLA))
	    {
	    	return "0";
	    }else if(tile.equals(Tile.XIS))
	    {
	    	return "X";
	    }
		return "_";
	}
	
}
