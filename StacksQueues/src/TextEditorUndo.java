public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // TODO 1: initialize the stack array
        // TODO 2: set initial top index to -1
        stack = new String[size];
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        // TODO 3: check if the stack is full
        // TODO 4: print message if the stack is full
        // TODO 5: increment top and add action to the stack
        // TODO 6: print confirmation message
        if (top == stack.length - 1) {
            System.out.println("Stack is full.");
        } else {
            stack[top++] = action;
            System.out.println(action + " has been added.");
        }
    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        // TODO 7: Check if the stack is empty
        // TODO 8: Print message if the stack is empty and return null
        // TODO 9: Retrieve and remove the top action from the stack
        // TODO 10: Print confirmation message, return and replace empty string with the undone action
        if (top == -1) {
            System.out.println("Stack is empty! Can't pop.");
            return null;
        } else {
            String poppedValue = stack[top--];
            System.out.println("Popped element: "+poppedValue);
            return poppedValue;
        }


    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        // TODO 11: Check if the stack is empty
        // TODO 12: Print message if the stack is empty and return null
        // TODO 13: Return and replace empty string with the most recent action without removing it
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            System.out.println("Top element: "+ stack[top]);
            return stack[top];
        }
    }

    // Method to display all actions in the stack
    public void display() {
        // TODO 14: Check if the stack is empty
        // TODO 15: Print message if the stack is empty
        // TODO 16: Iterate through the stack and print each action
        // TODO 17: Print a new line after displaying all actions
        int itemNum = 1;
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i>= 0; i--) {
                System.out.println("Action "+itemNum+" : "+stack[i]);
                itemNum++;
            }
        }
    }
}