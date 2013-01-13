package net.catacombsnatch.game.core.sound;

public interface ISoundPlayer {

	public static final String BACKGROUND_TRACK = "background";

	public abstract void startTitleMusic();
	
	public abstract void stopTitleMusic();

	public abstract void startEndMusic();
	
	public abstract void stopEndMusic();

	public abstract void startBackgroundMusic();

	public abstract void stopBackgroundMusic();
	
	public abstract void pauseBackgroundMusic();
	
	public abstract void resumeBackgroundMusic();

	public abstract void setListenerPosition(float x, float y);

	public abstract boolean playSound(String sourceName, float x, float y);

	public abstract boolean playSound(String sourceName, float x, float y, boolean blocking);

	public abstract void shutdown();

	public abstract boolean isMuted();

	public abstract void setMuted(boolean muted);

}
