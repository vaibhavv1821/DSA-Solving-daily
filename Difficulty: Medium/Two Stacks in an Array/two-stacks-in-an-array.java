class twoStacks {

    int arr[] = new int[100];
    int top1;
    int top2;

    twoStacks() {
        top1 = -1;
        top2 = arr.length;
    }

    // push into stack1
    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        }
    }

    // push into stack2
    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        }
    }

    // pop from stack1
    int pop1() {
        if (top1 == -1) {
            return -1;
        }
        return arr[top1--];
    }

    // pop from stack2
    int pop2() {
        if (top2 == arr.length) {
            return -1;
        }
        return arr[top2++];
    }
}