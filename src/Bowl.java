class Bowl {
    private int food;

    public Bowl (int food) {
        if (food < 0) {
            this.food = 0;
        } else {
            this.food = food;
        }
    }

    public int getFood() {
        return food;
    }

    public void eatingFood (int amountFood) {
        if (food >= amountFood) {
            food -= amountFood;
        } else {
            food = 0;
        }
    }

    public void addFood (int amountFood) {
        if (amountFood > 0) {
            food += amountFood;
        }
    }
}