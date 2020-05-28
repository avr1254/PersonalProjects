#include "LinkedList.c"


void push(int);
void print();
node pop();

struct Stack {
    node n;
};


typedef struct Stack *stack;

/*int main()
{
    push(5);
    push(50);
    push(500);
    print();
    return 0;
}*/

/**
 * @brief  Pushes a node to the top of the stack.
 * @note   
 * @param  i: The value of the node being pushed.
 * @retval None
 */
void push(int i)
{
    add(i);
}

/**
 * @brief  Pops the top node off the linked list.
 * @note   
 * @retval The popped node.
 */
node pop()
{  
    node temp = getHead();
    setHead(head -> next);
    return temp;
}

/**
 * @brief  A function that prints out all the nodes in the linked list from the head on.
 * @note    This function is simple enough. It prints out each node in a top-down manner.
 * @retval None
 */
void print()
{
    node p = head;
    int i = 0;
    while (p != NULL)
    {
        printf("{%d,%d}\n ", i, p->data);
        i++;
        p = p->next;
    }  
}
