package frc.lib.controllers;

import edu.wpi.first.wpilibj.buttons.Button;
import frc.lib.drivers.SpectrumDigitalInput;

public class SpectrumIOButton extends Button {

	SpectrumDigitalInput input;

	public SpectrumIOButton(SpectrumDigitalInput i) {
		input = i;
	}

	public boolean get(){
		return !input.get();
	}
}
