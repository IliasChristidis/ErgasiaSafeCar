
import java.util.ArrayList;
import java.util.List;
	
public class ArcheioPelaton {
	


	    private List<Pelatis> pelates;
	    private List<Oxima> oximata;

	    public ArcheioPelaton() {
	        this.pelates = new ArrayList<>();
	        this.oximata = new ArrayList<>();
	    }

	    // Μέθοδος αρχειοθέτηση
	    public void arxeiothetisi(Pelatis pelatis, Oxima oxima) {
	        pelates.add(pelatis);
	        oximata.add(oxima);
	    }

	    // Μέθοδος προσέθεσε
	    public void prosethese(Oxima oxima) {
	        oximata.add(oxima);
	    }

	    // Getters
	    public List<Pelatis> getPelates() {
	        return pelates;
	    }

	    public List<Oxima> getOximata() {
	        return oximata;
	    }
	}


