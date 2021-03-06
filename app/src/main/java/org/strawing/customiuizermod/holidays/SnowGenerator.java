package org.strawing.customiuizermod.holidays;

import android.content.Context;

import com.github.jinatonic.confetti.ConfettoGenerator;
import com.github.jinatonic.confetti.confetto.Confetto;
import com.github.matteobattilana.weather.PrecipType;
import com.github.matteobattilana.weather.confetti.ConfettoInfo;

import java.util.Random;

public class SnowGenerator implements ConfettoGenerator {
	private final ConfettoInfo confettoInfo;
	private final Context context;

	public SnowGenerator(Context ctx) {
		super();
		this.context = ctx;
		this.confettoInfo = new ConfettoInfo(PrecipType.SNOW);
	}

	public Confetto generateConfetto(Random random) {
		return new SnowParticle(this.context, this.confettoInfo);
	}

	public final ConfettoInfo getConfettoInfo() {
		return this.confettoInfo;
	}
}
