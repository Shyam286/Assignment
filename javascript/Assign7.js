function min() {
    if (arguments.length === 0) {
        console.log("No arguments provided.");
        return;
    }

    let minVal = arguments[0];
    for (let i = 1; i < arguments.length; i++) {
        if (arguments[i] < minVal) {
            minVal = arguments[i];
        }
    }

    console.log("The minimum value is:", minVal);
    return minVal;
}

min(5, 2, 8, 1, 10); 
min(3, 7, 2, 9);    
min();    