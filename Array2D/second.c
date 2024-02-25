#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Queue
{
    struct Node *rear;
};

void initializeQueue(struct Queue *queue)
{
    queue->rear = NULL;
}

int isEmpty(struct Queue *queue)
{
    return queue->rear == NULL;
}

void enqueue(struct Queue *queue, int data)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    if (newNode == NULL)
    {
        printf("Memory allocation failed\n");
        return;
    }
    newNode->data = data;
    if (isEmpty(queue))
    {
        newNode->next = newNode;
        queue->rear = newNode;
    }
    else
    {
        newNode->next = queue->rear->next;
        queue->rear->next = newNode;
        queue->rear = newNode;
    }
}

int dequeue(struct Queue *queue)
{
    if (isEmpty(queue))
    {
        printf("Queue underflow\n");
        return -1;
    }
    int dequeued;
    if (queue->rear->next == queue->rear)
    {
        dequeued = queue->rear->data;
        free(queue->rear);
        queue->rear = NULL;
    }
    else
    {
        struct Node *front = queue->rear->next;
        dequeued = front->data;
        queue->rear->next = front->next;
        free(front);
    }
    return dequeued;
}

int peek(struct Queue *queue)
{
    if (isEmpty(queue))
    {
        printf("Queue is empty\n");
        return -1;
    }
    return queue->rear->next->data;
}

int main()
{
    struct Queue queue;
    initializeQueue(&queue);

    enqueue(&queue, 1);
    enqueue(&queue, 2);
    enqueue(&queue, 3);

    printf("Front element: %d\n", peek(&queue));

    printf("Dequeued element: %d\n", dequeue(&queue));
    printf("Dequeued element: %d\n", dequeue(&queue));

    enqueue(&queue, 4);

    printf("Front element: %d\n", peek(&queue));

    return 0;
}
