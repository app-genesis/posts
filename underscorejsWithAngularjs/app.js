var app = angular.module('undersocre', []);

app.controller('MainCtrl', function($scope) {

  $scope.arrayTitle = "Array Functions";
  $scope.collectionTitle = "Collection Functions";
  $scope.objectTitle = "Object Functions";

  // Array Functions
  var arr = [0,1,2,3,4,5,6,7,8,9];
  $scope.first = _.first(arr);
  $scope.last = _.last(arr);
  $scope.initial = _.initial(arr);
  $scope.without = _.without(arr, 3,7);
  $scope.union = _.union(arr, [10, 2, 1, 11], [2, 1]);
  $scope.intersection  = _.intersection (arr, [10, 2, 1, 11], [2, 7]);
  $scope.difference  = _.difference (arr, [9, 2, 1, 6]);

  // Collection Functions
   _.each([0, 2,5], function(num){ console.log(this[num]); }, arr);
  $scope.filter = _.filter(arr, function(num){ return num % 2 == 0; });
  $scope.map = _.map(arr, function(num){ return num * 3; });
  $scope.reduce = _.reduce(arr, function(memo, num){ return memo + num; }, 0);



  var persons = [ { firstName: "Dimitris", lastName: "Ganosis" },
                  { firstName: "John", lastName: "Val" }];
  $scope.pluck = _.pluck(persons, 'firstName');
  
  // Object Functions
  $scope.keys = _.keys({one: 1, two: 2, three: 3});
  $scope.values = _.values({one: 1, two: 2, three: 3});
  $scope.pairs = _.pairs({one: 1, two: 2, three: 3});
  
  // The generic array functions are always available!
  $scope.push = arr.push(21);
  console.log("push(21) " + arr);
  $scope.unshift = arr.unshift(22);
  console.log("unshift(22) " + arr);
  $scope.pop = arr.pop();
  console.log("arr.pop() " + arr);
  $scope.shift = arr.shift();
  console.log("arr.shift() " + arr);
  $scope.splice = arr.splice(5,3);
  console.log("splice(5,3) " + arr);

var Dog = function(){ 
    return { 
        speak: "Woof" 
    } 
};   
var Cat = function(){ 
    return { 
        speak: "Niaou" 
  } 
};     
var animalFactoryClass = function(){ 
    return{ 
        create: function(kind){ 
            switch(kind){ 
                case "dog": return new Dog(); 
                case "cat": return new Cat(); 
            } 
        } 
    }; 
};    
var animalFactory = new animalFactoryClass(); 

var d = animalFactory.create("dog");   
console.log(d.speak);
var c = animalFactory.create("cat");   
console.log(c.speak);

});
