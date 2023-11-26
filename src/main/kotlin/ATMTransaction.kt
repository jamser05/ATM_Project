interface ATMTransaction {
    fun processTransaction()
}

// Implmenting for interface will allow us to have an abstract version for
// our function processTransaction allowing the use of polymorphism
// Reduced Coupling: Separating the interface from the concrete classes
// (implementations) reduces coupling between classes.
// This separation adheres to the Dependency Inversion Principle
// ,making it easier to switch implementations and introduce new functionality
// without affecting the existing codebase.