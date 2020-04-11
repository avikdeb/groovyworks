int opportunityOne = 1000
int opportunityTwo = 2000
int opportunityThree = 3000
int opportunityFour = 4000
int opportunityFive = 5000
int totalOpportnity = 0

// Create a groovy list
List opportunities = [opportunityOne, opportunityTwo, opportunityThree, opportunityFour, opportunityFive]

// Iterate through the loop
for(int i=0; i<opportunities.size; i++) {
  println "Found an opportunity of ${opportunities[i]}"
  totalOpportnity += opportunities[i]
  println "Total opportunity is now ${totalOpportnity}"
}
