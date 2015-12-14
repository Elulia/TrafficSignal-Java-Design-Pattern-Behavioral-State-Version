package fr.iutvalence.info.dut.m3105.pattern.state;

public interface TSColorChangeObserver {
	
	public void notifyColorChange(TSColor color);
	
	public void notifyButtonPressed();
}
