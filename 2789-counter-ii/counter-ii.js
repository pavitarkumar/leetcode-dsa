class Counter {
    constructor(init){
    this.init = init;
    this.current = init;
    }
    increment(){
        return ++this.current;
    }
    decrement(){
        return --this.current;
    }
    reset(){
        this.current = this.init;
        return this.init;
    }
}

/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    return new Counter(init);
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */