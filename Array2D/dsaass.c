// #include <stdio.h>
// #include <stdlib.h>

// #define MAX_SIZE 100

// int stack[MAX_SIZE];
// int top = -1;

// void push(int data)
// {
//     if (top == MAX_SIZE - 1)
//     {
//         printf("Stack overflow\n");
//         return;
//     }
//     top++;
//     stack[top] = data;
// }

// int pop()
// {
//     if (top == -1)
//     {
//         printf("Stack underflow\n");
//         return -1;
//     }
//     return stack[top--];
// }

// int peek()
// {
//     if (top == -1)
//     {
//         printf("Stack is empty\n");
//         return -1;
//     }
//     return stack[top];
// }

// int isEmpty()
// {
//     return top == -1;
// }

// int main()
// {
//     push(1);
//     push(2);
//     push(3);

//     printf("Top element: %d\n", peek());

//     printf("Popped element: %d\n", pop());
//     printf("Popped element: %d\n", pop());

//     printf("Is stack empty? %s\n", isEmpty() ? "Yes" : "No");

//     return 0;
// }

#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* top = NULL;

void push(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Stack overflow\n");
        return;
    }
    newNode->data = data;
    newNode->next = top;
    top = newNode;
}

int pop() {
    if (top == NULL) {
        printf("Stack underflow\n");
        return -1;
    }
    int popped = top->data;
    struct Node* temp = top;
    top = top->next;
    free(temp);
    return popped;
}

int peek() {
    if (top == NULL) {
        printf("Stack is empty\n");
        return -1;
    }
    return top->data;
}

int isEmpty() {
    return top == NULL;
}

int main() {
    push(1);
    push(2);
    push(3);
    
    printf("Top element: %d\n", peek());
    
    printf("Popped element: %d\n", pop());
    printf("Popped element: %d\n", pop());
    
    printf("Is stack empty? %s\n", isEmpty() ? "Yes" : "No");
    
    return 0;
}

