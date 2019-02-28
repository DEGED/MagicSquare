package model;
import customExceptions.ParException;
public class AlgorithmMagicSquare{
	/*
 	* The constant UP contains a number who is the reference of the position middle up on the magic square 
 	*/
	public final static int UP = 1;
	/*
 	* The constant LEFT contains a number who is the reference of the position middle left on the magic square 
 	*/
	public final static int LEFT = 2;
	/*
 	* The constant RIGTH contains a number who is the reference of the position middle right on the magic square 
 	*/
	public final static int RIGHT = 3;
	/*
	 * The constant DOWN contains a number who is the reference of the position middle down on the magic square 
	 */	
	public final static int DOWN = 4;
	/*
	 * The constant NORTH_WEST contains a number who is the reference of the fill direction north west on the magic square 
	 */
	public final static int NORTH_WEST = 1;
	/*
	 * The constant NORTH_EAST contains a number who is the reference of the fill direction north east on the magic square 
	 */
	public final static int NORTH_EAST = 2;
	/*
	 * The constant SOUTH_WEST contains a number who is the reference of the fill direction south west on the magic square 
	 */
	public final static int SOUTH_WEST = 3;
	/*
	 * The constant SOUTH_EAST contains a number who is the reference of the fill direction south east the magic square 
	 */
	public final static int SOUTH_EAST = 4;
	
	/*
	 * This attribute contains the magic square who is saw in the GUI
	 */
	private int[][] magicSquare; 
	/*
	 * This attribute contains the size of magic square
	 */
	private int size; 
	/*
	 * This attribute contains the initial position where the magic square stars the fill
	 */
	private int inicialPosition;
	/*
	 * This attribute contains the direction where the magic square starts the fill
	 */
	private int direction;
	
	/*
	 * This is the constructor of the class
	 */
	
	public AlgorithmMagicSquare(int size, int inicialPosition, int direction) throws NegativeArraySizeException, NumberFormatException {
		this.size = size;
		this.inicialPosition = inicialPosition;
		this.direction = direction; 
		magicSquare = new int[size][size]; 
	}

	/*
	 * This method allows know if the size is par or odd for start the fill in the magic square because if the matrix 
	 * this not odd there will not be a middle for begin the fill of the magic square.
	 */
	public boolean isImpar() throws ParException {
		boolean flag = false;
	    
		return flag;
	}
	/*
	 * This method allows fill the attribute magicSquare
	 * <B>pre:</b>magicSquare <!= null
	 * @param a boolean who is the indicative if the matrix are par or odd
	 */
	public void magicFill() throws ParException {
		if(size%2 == 0) {
	    	throw new ParException(size);
	    }
		else {
			switch(getInicialPosition()) {
				case 1:
					if(direction == NORTH_WEST) {
						upNorthWest();
					}
					else if(direction == NORTH_EAST) {
						upNorthEast();
					}
				break;
				case 2:
					if(direction == NORTH_WEST) {
						LeftNorthWest();
					}
					else if(direction == SOUTH_WEST) {
						LeftSouthWest();
					}
				break;
				case 3:
					if(direction == NORTH_EAST) {
						rigthNorthEast();
					}
					else if(direction == SOUTH_EAST) {
						rigthSouthEast();
					}
				break;
				case 4:
					if(direction == SOUTH_WEST) {
						downSouthWest();
					}
					else if(direction == SOUTH_EAST) {
						downSouthEast();
					}
				break;
			}
		}
	}
	/*
	 * this method allows fill the magic square in the position up middle and direction north east
	 */
	public void upNorthEast() {
		
		int number = 1;
		int tamaño = size;
		int actualRow = 0;
		int actualColumn = 0;
		actualColumn = --tamaño;
		actualColumn = (actualColumn/2);
	
		
		while(number <= size*size) {
			
			magicSquare[actualRow][actualColumn] = number;
			number++;
			actualRow--;
			actualColumn++;
			if(actualColumn == size && actualRow < 0) {
				actualColumn = size-1;
				actualRow = actualRow+2;
			}
			if(actualColumn == size) {
				actualColumn = 0;
				
			}
			if(actualRow < 0) {
				actualRow = size-1;
				
			}
			if(magicSquare[actualRow][actualColumn] != 0 ) {
				if(actualColumn > 0) {	
					actualColumn=actualColumn-1;
					actualRow = actualRow+2;
					if(actualColumn < 0) {
						actualColumn = 0;
						actualRow--;
						}
				}	
			}
			
		}
		
	}
	/*
	 * this method allows fill the magic square in the pisition up middle and direction north west
	 */
	public void upNorthWest() {
		
		int number = 1;
		int tamaño = size;
		int actualRow = 0;
		int actualColumn = 0;
		actualColumn = --tamaño;
		actualColumn = (actualColumn/2);
	
		
		while(number <= size*size) {
			
			magicSquare[actualRow][actualColumn] = number;
			number++;
			actualRow--;
			actualColumn--;
			if(actualColumn < 0 && actualRow < 0) {
				actualColumn=actualColumn+1;
				actualRow = actualRow+2;
			}
			if(actualColumn < 0) {
				actualColumn = size-1;
				
			}
			if(actualRow < 0) {
				actualRow = size-1;
				
			}
			if(magicSquare[actualRow][actualColumn] != 0 ) {
				if(actualColumn >= 0) {	
					actualColumn=actualColumn+1;
					actualRow = actualRow+2;
					if(actualColumn < 0) {
						actualColumn = 0;
						actualRow--;
						}
				}	
			}
		
		}
		
	}
	/*
	 * this method allows fill the magic square in the position left middle and direction north west
	 */
	public void	LeftNorthWest() {
		
		int number = 1;
		int tamaño = size;
		int actualRow = 0;
		int actualColumn = 0;
		actualRow = --tamaño;
		actualRow = (actualRow/2);
	
		
		while(number <= size*size) {
			
			magicSquare[actualRow][actualColumn] = number;
			number++;
			actualRow--;
			actualColumn--;
			if(actualColumn < 0 && actualRow < 0) {
				actualRow=actualRow+1;
				actualColumn = actualColumn+2;
			}
			if(actualColumn < 0) {
				actualColumn = size-1;
				
			}
			if(actualRow < 0) {
				actualRow = size-1;
				
			}
			if(magicSquare[actualRow][actualColumn] != 0 ) {
				if(actualColumn >= 0) {	
					actualRow=actualRow+1;
					actualColumn = actualColumn+2;
					if(actualColumn < 0) {
						actualColumn = 0;
						actualRow--;
						}
				}	
			}
			
			
		}
		
	}
	/*
	 * this method allows fill the magic square in the position left middle and direction south west
	 */
	public void LeftSouthWest() {
	
		int number = 1;
		int tamaño = size;
		int actualRow = 0;
		int actualColumn = 0;
		actualRow = --tamaño;
		actualRow = (actualRow/2);
	
		
		while(number <= size*size) {
			magicSquare[actualRow][actualColumn] = number;
			number++;
			actualRow++;
			actualColumn--;
			if(actualColumn < 0 && actualRow == size) {
				actualRow=actualRow-1;
				actualColumn = actualColumn+2;
			}
			if(actualColumn < 0) {
				actualColumn = size-1;
				
			}
			if(actualRow == size) {
				actualRow = 0;
				
			}
			if(magicSquare[actualRow][actualColumn] != 0 ) {
				if(actualColumn >= 0) {	
					actualRow=actualRow-1;
					actualColumn = actualColumn+2;
					if(actualColumn < 0) {
						actualColumn = 0;
						actualRow--;
						}
				}	
			}
		}
		
	}
	/*
	 * this method allows fill the magic square in the position right middle and direction north east
	 */
	public void rigthNorthEast(){
		
		int number = 1;
		int tamaño = size;
		int actualRow = 0;
		int actualColumn = 0;
		actualRow = --tamaño;
		actualRow = (actualRow/2);
		actualColumn = tamaño;
		
		while(number <= size*size) {
			
			magicSquare[actualRow][actualColumn] = number;
			number++;
			actualRow--;
			actualColumn++;
			if(actualColumn == size && actualRow < 0) {
				actualColumn = size-2;
				actualRow++;
			}
			if(actualColumn == size) {
				actualColumn = 0;
				
			}
			if(actualRow < 0) {
				actualRow = size-1;
				
			}
			if(magicSquare[actualRow][actualColumn] != 0 ) {
				if(actualColumn > 0) {	
					actualColumn=actualColumn-2;
					actualRow++;
					if(actualColumn < 0) {
						actualColumn = 0;
						actualRow--;
						}
				}	
			}
				
		}
		
	}
	/*
	 * This method allows fill the magic square in the position right middle and direction south east
	 */
	public void rigthSouthEast() {
		
		int number = 1;
		int tamaño = size;
		int actualRow = 0;
		int actualColumn = 0;
		actualRow = --tamaño;
		actualRow = (actualRow/2);
		actualColumn = tamaño;
		
		while(number <= size*size) {
			
			magicSquare[actualRow][actualColumn] = number;
			number++;
			actualRow++;
			actualColumn++;
			if(actualColumn == size && actualRow == size) {
				actualColumn = actualColumn-2;
				actualRow = actualRow-1;
			}
			if(actualColumn == size) {
				actualColumn = 0;
				
			}
			if(actualRow == size) {
				actualRow = 0 ;
				
			}
			if(magicSquare[actualRow][actualColumn] != 0 ) {
				if(actualColumn > 0) {	
				    actualColumn = actualColumn-2;
					actualRow = actualRow-1;
					if(actualColumn < 0) {
						actualColumn = 0;
						actualRow--;
						}
				}	
			}
				
		}
		
	}
	/*
	 * This method allows fill the magic square in the position down middle and direction south west
	 */
	public void downSouthWest() {
		int number = 1;
		int tamaño = size;
		int actualRow = 0;
		int actualColumn = 0;
		actualColumn = --tamaño;
		actualColumn = (actualColumn/2);
		actualRow = size-1;
		
		while(number <= size*size) {
		
			magicSquare[actualRow][actualColumn] = number;
			number++;
			actualRow++;
			actualColumn--;
			if(actualColumn < 0 && actualRow == size) {
				actualColumn=actualColumn+1;
				actualRow = actualRow-2;
			}
			if(actualColumn < 0) {
				actualColumn = size-1;
				
			}
			if(actualRow == size) {
				actualRow = 0;
				
			}
			if(magicSquare[actualRow][actualColumn] != 0 ) {
				if(actualColumn >= 0) {	
					actualColumn=actualColumn+1;
					actualRow = actualRow-2;
					if(actualColumn < 0) {
						actualColumn = 0;
						actualRow--;
						}
				}	
			}
		
		}
	}
	/*
	 * This method allows fill the magic square in the position down middle and direction south east
	 */
	public void downSouthEast() {
		int number = 1;
		int tamaño = size;
		int actualRow = 0;
		int actualColumn = 0;
		actualColumn = --tamaño;
		actualColumn = (actualColumn/2);
		actualRow = size-1;
		
		while(number <= size*size) {
	
			magicSquare[actualRow][actualColumn] = number;
			number++;
			actualRow++;
			actualColumn++;
			if(actualColumn == size && actualRow == size) {
				actualColumn=actualColumn-1;
				actualRow = actualRow-2;
			}
			if(actualColumn == size) {
				actualColumn = 0;
				
			}
			if(actualRow == size) {
				actualRow = 0;
				
			}
			if(magicSquare[actualRow][actualColumn] != 0 ) {
				if(actualColumn >= 0) {	
					actualColumn=actualColumn-1;
					actualRow = actualRow-2;
					if(actualColumn < 0) {
						actualColumn = 0;
						actualRow--;
						}
				}	
			}
		}
	}
	/*
	 *This method allows get the attribute magicSquare. 
	 *@return the matrix with the magic square. 
	 */
	public int[][] getMagicSquare() {
		return magicSquare;
	}
	/*
	 * This method allows change the attribute magicSquare.
	 * @param a new matrix. x != null.
	 */
	public void setMagicSquare(int[][] x) {
		this.magicSquare = x;
	}
	/*
	 * This method allows get the attribute size..
	 * @return the size of the matrix.
	 */
	public int getSize() {
		return size;
	}
	/*
	 * This method allows change the attribute size.
	 * @param a new size value. size != null.
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/*
	 * This method allows get the attribute inicialPosition
	 * @return initial position in the matrix
	 */
	public int getInicialPosition() {
		return inicialPosition; 
	}
	/*
	 * This method allows change the attribute inicialPosition 
	 * @param the new initial direction in the matrix. x != null.
	 */
	public void setInicialposition(int x) {
		this.inicialPosition = x;
	}
	/*
	 * This method allows get the attribute direction
     * @return the fill direction in the matrix.
	 */
	public int getDirection() {
		return direction;
	}
	/*
	 * This method allows change the attribute direction
	 * @param the direction of fill in the magic square. x != null.
	 */
	public void setDirection(int x) {
		this.direction = x;
	}
	
}
