var myApp = angular.module('myApp', []);

myApp.controller("counterController", function($http, $scope) {
    $scope.increment =  function() {
        $http.get('/counter').then(function(response) {
            $scope.count = response.data;
        });
    }

    $scope.increment();
});


myApp.controller("additionController", function($http, $scope) {
    $scope.add =  function() {
        $http.get('/adder',{params:{firstNumber: $scope.firstNumber, secondNumber: $scope.secondNumber}}).then(
        function(response){
            $scope.additionResult = response.data;
        });
    }


});