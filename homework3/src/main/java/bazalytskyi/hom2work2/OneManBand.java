package bazalytskyi.hom2work2;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class OneManBand implements Performer {
	public OneManBand() {
	}

	public void perform() {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	@Autowired
	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
}
