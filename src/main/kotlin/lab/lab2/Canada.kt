package lab.lab2

class Canada() {
    var provinces = arrayOf<Array<String>>()
    
    init {
        provinces += arrayOf<String>("Ontario", "Toronto", "13448494")
        provinces += arrayOf<String>("Quebec", "Québec City", "8164361")
        provinces += arrayOf<String>("British Columbia", "Victoria", "4648050")
        provinces += arrayOf<String>("Alberta", "Edmonton", "4067175")
        provinces += arrayOf<String>("Manitoba", "Winnipeg", "1278365")
        provinces += arrayOf<String>("Saskatchewan", "Regina", "1098352")
        provinces += arrayOf<String>("Nova Scotia", "Halifax", "923598")
        provinces += arrayOf<String>("NewBrunswick", "Fredericton", "747101")
        provinces += arrayOf<String>("Newfoundland and Labrador", "St.Johns", "519716")
        provinces += arrayOf<String>("Prince Edward Island", "Charlottetown", "142907")
    }
    
    public fun displayAllProvinces() {
        for (province in this.provinces) {
            var pro = Province(province[0], province[1], province[2].toLong())
            println(pro.getDetails())
        }
    }
    
    public fun getNumOfProvincesBetween(minInMillion : Int, maxInMillion : Int) : Int {
        val min = minInMillion * 1000000
        val max = maxInMillion * 1000000
        
        var count = 0
        for (province in this.provinces) {
            count += if (province[2].toLong() in min..max) 1 else 0
        }
        return count
    }
}