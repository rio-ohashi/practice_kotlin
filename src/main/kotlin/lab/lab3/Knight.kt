package lab.lab3

class Knight : Piece() {
    override var value = 2
    override var isWhite = false
    
    override fun move() {
        println("Like an L")
    }
    
    override fun toString() : String {
        return "Knight{value=${value}}"
    }
    
    override fun equals(other : Piece) : Boolean {
        return other.value == this.value &&
                other.isWhite == this.isWhite
    }
}