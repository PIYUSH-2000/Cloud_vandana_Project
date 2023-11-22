function bubbleSort(arr) {
    var n = arr.length;
    var swapped;

    do {
        swapped = false;

        for (var i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                var temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
        n--;
    } while (swapped);
    return arr;
}
var unsortedArray = [64, 34, 25, 12, 22, 11, 90];
console.log("Unsorted Array: " + unsortedArray);

var sortedArray = bubbleSort(unsortedArray.slice());
console.log("Sorted Array: " + sortedArray);
