class StockSpanner {

    class Pair {
        int price;
        int day;

        Pair(int price, int day) {
            this.price = price;
            this.day = day;
        }
    }

    Stack<Pair> st;
    int day;

    public StockSpanner() {
        st = new Stack<>();
        day = 0;
    }

    public int next(int price) {

        while (!st.isEmpty() && st.peek().price <= price) {
            st.pop();
        }

        int span;

        if (st.isEmpty()) {
            span = day + 1;
        } else {
            span = day - st.peek().day;
        }

        st.push(new Pair(price, day));
        day++;

        return span;
    }
}