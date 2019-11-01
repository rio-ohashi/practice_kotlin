package lab.lab3

class Pawn : Piece(), Promotion {
    override var value = 1
    override var isWhite = false
    var promoted = false
    var newPiece : Piece? = null
    
    override fun move() {
        println("Forward 1")
    }
    
    override fun toString() : String {
        return "Pawn{value=${value}}"
    }
    
    override fun equals(other : Piece) : Boolean {
        return if (other !is Pawn) {
            other.value == this.value &&
                    other.isWhite == this.isWhite
        } else {
            if (other.promoted || this.promoted) {
                other.newPiece == this.newPiece &&
                        other.isWhite == this.isWhite
            } else {
                other.value == this.value &&
                        other.isWhite == this.isWhite
            }
        }
    }
    
    override fun promote(newPiece : Piece?) {
        this.promoted = true
        this.newPiece = newPiece
    }
}