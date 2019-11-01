package lab.lab3

class Bishop : Piece() {
    override var value = 3
    override var isWhite = false
    
    override fun move() {
        println("Diagonally")
    }
    
    override fun toString() : String {
        return "Bishop{value=${value}}"
    }
    
    override fun equals(other : Piece) : Boolean {
        return other.value == this.value &&
                other.isWhite == this.isWhite
    }
}