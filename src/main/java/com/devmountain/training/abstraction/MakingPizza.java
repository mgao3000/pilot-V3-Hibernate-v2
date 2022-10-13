package com.devmountain.training.abstraction;

    public abstract class MakingPizza {

        public final Pizza makePizza() {
            prepareDough();

            int doughWeight = weightDough();
            if(doughWeight < 10)
                throw new BadPizzaException("The dough is not heavy enough, throw it away!");

            prepareIngredients();
            int numberOfIngredients = countIngredients();
            if(numberOfIngredients < 5)
                throw new BadPizzaException("The number Of Ingredients is not less than requirement, have to stopping making pizza!");

            prepareToppings();
            int numberOfToppings = checkToppings();
            if(numberOfToppings < 5)
                throw new BadPizzaException("The number Of Toppings is not less than requirement, have to stopping making pizza!");

            RollingOutDough();
            int doughSize = checkDoughSize();
            if(doughSize < 18)
                throw new BadPizzaException("The size of dough is too small, stop the pizza making process!");

            // Now it seems everything is OK, start making pizza
            Pizza pizza = new Pizza(doughSize, numberOfToppings);
            return pizza;
        }

        public abstract void prepareIngredients();

        public abstract int weightDough();

        public abstract void prepareDough();

        public abstract int countIngredients();

        public abstract void RollingOutDough();

        public abstract int checkDoughSize();

        public abstract void prepareToppings();

        public abstract int checkToppings();


    }
