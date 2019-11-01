package lab.lab3

abstract class Piece {
    abstract var value : Int
    abstract var isWhite : Boolean
    
    abstract fun move()
    
    abstract override fun toString() : String
    
    open fun equals(other : Piece) : Boolean {
        return other.value == this.value &&
                other.isWhite == this.isWhite
    }
}