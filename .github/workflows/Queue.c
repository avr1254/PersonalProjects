#include "Stack.c"

void enqueue(int);
node dequeue();
struct Queue
{
    node n;
};

typedef struct Queue *queue;

/**
 * @brief  This function adds a node to the end of the queue.
 * @note   
 * @param  value: The value of the node being enqueued.
 * @retval None
 */
void enqueue(int value)
{
    if (size() < 1)
    {
        add(value);
    }
    else
    {
        insert(value, size());
    }
}

/**
 * @brief  This function removes the first node in the queue and returns it.
 * @note   
 * @retval the removed node.
 */
node dequeue()
{
    if (size() < 1)
    {
        return NULL;
    }
    else
    {
        node temp = head;
        setHead(head->next);
        return temp;
    }
}

/**
 * @brief  A function that prints out all the nodes in the linked list from the head on.
 * @note    This function is simple enough. It prints out each node in a top-down manner.
 * @retval None
 */
void printQueue()
{
    if (size() < 1)
    {
        return;
    }
    else
    {
        node p = head;
        printf("{");
        while (p->next != NULL)
        {
            printf("%d, ", p->data);
            p = p->next;
        }
        printf("%d}\n", p->data);
    }
}