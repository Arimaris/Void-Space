package rbadia.voidspace.main;

/**
 * Container for game flags and/or status variables.
 */
public class GameStatus {
	// game flags
	private boolean gameStarted = false;
	private boolean gameStarting = false;
	private boolean gameOver = false;
	
	// status variables
	private boolean newShip;
	private boolean newAsteroid;
	private boolean newEnemyShip;
	private long asteroidsDestroyed = 0;
	private long enemyShipsDestroyed = 0;
	private int shipsLeft;
	private long score = 0;
	
	public GameStatus(){
		
	}
	
	/**
	 * Indicates if the game has already started or not.
	 * @return if the game has already started or not
	 */
	public synchronized boolean isGameStarted() {
		return gameStarted;
	}
	
	public synchronized void setGameStarted(boolean gameStarted) {
		this.gameStarted = gameStarted;
	}
	
	/**
	 * Indicates if the game is starting ("Get Ready" message is displaying) or not.
	 * @return if the game is starting or not.
	 */
	public synchronized boolean isGameStarting() {
		return gameStarting;
	}
	
	public synchronized void setGameStarting(boolean gameStarting) {
		this.gameStarting = gameStarting;
	}
	
	/**
	 * Indicates if the game has ended and the "Game Over" message is displaying.
	 * @return if the game has ended and the "Game Over" message is displaying.
	 */
	public synchronized boolean isGameOver() {
		return gameOver;
	}
	
	public synchronized void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
	
	/**
	 * Indicates if a new ship should be created/drawn.
	 * @return if a new ship should be created/drawn
	 */
	public synchronized boolean isNewShip() {
		return newShip;
	}

	public synchronized void setNewShip(boolean newShip) {
		this.newShip = newShip;
	}

	/**
	 * Indicates if a new asteroid should be created/drawn.
	 * @return if a new asteroid should be created/drawn
	 */
	public synchronized boolean isNewAsteroid() {
		return newAsteroid;
	}

	public synchronized void setNewAsteroid(boolean newAsteroid) {
		this.newAsteroid = newAsteroid;
	}

	/**
	 * Returns the number of asteroid destroyed. 
	 * @return the number of asteroid destroyed
	 */
	public synchronized long getAsteroidsDestroyed() {
		return asteroidsDestroyed;
	}

	public synchronized void setAsteroidsDestroyed(long asteroidsDestroyed) {
		this.asteroidsDestroyed = asteroidsDestroyed;
	}

	
	
	/**
	 * Indicates if a new enemy ship should be created/drawn.
	 * @return if a new enemy ship should be created/drawn
	 */
	
	public synchronized boolean isNewEnemyShip() {
		return newEnemyShip;
	}

	public synchronized void setNewEnemyShip(boolean newEnemyShip) {
		this.newEnemyShip = newEnemyShip;
	}

	/**
	 * Returns the number of enemy ships destroyed. 
	 * @return the number of enemy ships destroyed
	 */
	public synchronized long getEnemyShipsDestroyed() {
		return enemyShipsDestroyed;
	}

	public synchronized void setEnemyShipsDestroyed(long enemyShipsDestroyed) {
		this.enemyShipsDestroyed = enemyShipsDestroyed;
	}

	
	
	/**
	 * Returns the number ships/lives left.
	 * @return the number ships left
	 */
	public synchronized int getShipsLeft() {
		return shipsLeft;
	}

	public synchronized void setShipsLeft(int shipsLeft) {
		this.shipsLeft = shipsLeft;
	}
	
	/**
	 * Returns the score of the game.
	 * @return the score of the game
	 */
	public synchronized long getScore() {
		return score;
	}

	public synchronized void setScore(long score) {
		this.score = score;
	}
	

}
