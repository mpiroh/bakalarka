package sk.upjs.ics.bakalarka;

import java.util.ArrayList;
import java.util.List;

public class Automat {
	List<Stav> stavy = new ArrayList<Stav>();
	Stav pociatocnyStav;
	Stav koncovyStav;
	
	public void pridajStav(Stav stav) {
		stavy.add(stav);
	}
	
	public void vyrobId() {
		int id = 0;
		for (Stav stav : stavy) {
			stav.setId(id);
			id++;
		}
	}
	
	//------------------------------------------------------------------------
	public Stav getPociatocnyStav() {
		return pociatocnyStav;
	}

	public void setPociatocnyStav(Stav pociatocnyStav) {
		this.pociatocnyStav = pociatocnyStav;
	}

	public Stav getKoncovyStav() {
		return koncovyStav;
	}

	public void setKoncovyStav(Stav koncovyStav) {
		this.koncovyStav = koncovyStav;
	}

	public List<Stav> getStavy() {
		return stavy;
	}

	public void setStavy(List<Stav> stavy) {
		this.stavy = stavy;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Stav stav : stavy) {
			sb.append("Stav " + stav.getId() + ": ");
			if (stav == pociatocnyStav)
				sb.append("(počiatočný) ");
			if (stav == koncovyStav)
				sb.append("(koncový) ");
			sb.append("\n");
			
			sb.append(stav);
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
