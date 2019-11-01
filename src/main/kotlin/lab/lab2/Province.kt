package lab.lab2

const val LIMIT_POPULATION_MAX = 15000000
const val LIMIT_POPULATION_MIN = 30000
const val DEFAULT_POPULATION = 4648055L
const val DEFAULT_PROVINCE = "British Columbia"
const val DEFAULT_CAPITAL = "Victoria"

class Province(name : String, capital : String, population : Long) {
    
    private var name = ""
    private var capital = ""
    private var population = 0L
    
    init {
        if (isValidProvince(name) &&
            isValidCapital(capital) &&
            isValidPopulation(population)
        ) {
            this.name = name
            this.capital = capital
            this.population = population
        } else {
            this.name = DEFAULT_PROVINCE
            this.capital = DEFAULT_CAPITAL
            this.population = DEFAULT_POPULATION
        }
    }
    
    private fun isValidProvince(name : String) : Boolean {
        val provinces = arrayOf(
            "Alberta",
            "British Columbia",
            "Manitoba",
            "New Brunswick",
            "Newfoundland and Labrador",
            "Nova Scotia",
            "Ontario",
            "Prince Edward Island",
            "Quebec",
            "Saskatchewan"
        )
        return provinces.contains(name)
    }
    
    private fun isValidCapital(name : String) : Boolean {
        val capital = arrayOf(
            "St.Johns",
            "Charlottetown",
            "Halifax",
            "Fredericton",
            "Québec City",
            "Toronto",
            "Winnipeg",
            "Regina",
            "Edmonton",
            "Victoria",
            "Iqaluit",
            "Yellowknife",
            "Whitehorse"
        )
        return capital.contains(name)
    }
    
    private fun isValidPopulation(population : Long) : Boolean {
        return population in LIMIT_POPULATION_MIN..LIMIT_POPULATION_MAX
    }
    
    public fun getDetails() : String {
        return "The capital of ${this.name} (population. ${this.population}) is ${this.capital}."
    }
}
