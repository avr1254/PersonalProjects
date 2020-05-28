#include <stdio.h>
#include <stdlib.h>

int size();
struct Node
{
    struct Node *next;
    int data;
};

typedef struct Node *node;

node head; // Global Variable of type node for the head of the linked list.

/**
 * @brief  An accessor function for the global variable head.  
 * @note    This function simply acts as a "getter" for the global variable.
 * @retval  The head, of type node.
 */
node getHead()
{
    return head;
}

/**
 * @brief  A mutator function for the global variable head.
 * @note   This function simply acts as a "setter" for the global variable.
 * @param  n: The node that head will now point to.
 * @retval None
 */
void setHead(node n) // Mutator function for the head.
{
    head = n;
}

/**
 * @brief  A function that creates and allocates memory for a new node.
 * @note    This function takes the value and creates a node for it.
 * @param  value: The input for the data.
 * @retval Returns the node created by the function.
 */
node createNode(int value)
{
    node temp;
    temp = (node)malloc(sizeof(struct Node)); // Uses malloc to declare memory for the node.
    temp->next = NULL;
    temp->data = value;
    return temp;
}

/**
 * @brief  A function that creates and adds a new node to the head of the existing linked list.
 * @note    This function is the quintissential linked list add function.   
 * @param  value:  The value of the data of the new node to be added.
 * @retval  Returns the new head of the linked list, the previously added node.
 */
node add(int value) // Adds a node of a given value before the head of the linked list, and then makes that the head.
{
    node temp = createNode(value), p = head;
    temp->next = p;
    setHead(temp);
    return getHead();
}

/**
 * @brief  A function that removes the last node in the linked list.
 * @note    In addition to that, the function sets the next of the new last node to NULL
 * @retval  Returns the removed node.
 */
node rmv()
{
    node p = head;
    while (p->next->next != NULL)
    {
        p = p->next;
    }
    node temp = p->next;
    free(p->next);
    p->next = NULL;
    return temp;
}

/**
 * @brief Inserts a node of some value into the indexth slot on the linked list. 
 * @note   Different than the add() function, which just adds to the head. 
 * @param  value: The value of the data in the node.
 * @param  index: The index of where the node is to be inserted.
 * @retval  Returns the node of the value. 
 */
node insert(int value, int index)
{
    node p = head;
    int i = 0;
    while (p->next != NULL && i < index - 1)
    {
        p = p->next;
        i++;
    }
    node twoAhead = p->next, temp = createNode(value);
    p->next = temp;
    temp->next = twoAhead;
    return temp;
   
}

/**
 * @brief  Deletes a node from the linked list given the index its located in..  
 * @note    Different than the remove function, which just removes from the end.
 * @param  index:  The index of where the node is to be deleted.    
 * @retval  The deleted node.
 */
node delete(int index)
{
    node p = head;
    int i = 0;
    while(p -> next != NULL && i < index - 1)
    {
        p = p -> next;
        i++;
    }
    node oneAhead = p -> next -> next;
    node tbDeleted = p -> next;
    free(p -> next);
    p -> next = oneAhead;
    return tbDeleted;
}

/**
 * @brief  A function that prints out every element in the list.
 * @note    The structure of the print is [spot on list, data of the node]
 * @retval None
 */
void printList()
{
    node p = head;
    int i = 0;
    while (p != NULL)
    {
        printf("{%d,%d}, ", i, p->data);
        i++;
        p = p->next;
    }
    printf("\n");
}

/**
 * @brief  A function that frees all the previously allocated memory in the linked list.
 * @note   
 * @retval None
 */
void clearList()
{
    node p = head;
    int i = 0;
    while (p != NULL)
    {
        node temp = p->next;
        free(p);
        p = temp;
    }
}
/**
 * @brief  A function that returns the size of the linked list.
 * @note   It counts each node in the linked list and returns the number of nodes.
 * @retval  The integer value of the number of nodes in the list.
 */
int size()
{
    node p = head;
    int i = 0; 
    while(p != NULL)
    {
        p = p -> next;
        i++;
    }
    return i;
}

/*int main()
{
    node l = createNode(100);
    setHead(l);
    add(200);
    add(300);
    printList();
    //rmv();
    insert(500, 1);
    printList();
    delete(1);
    printList();
    clearList();
    setHead(NULL);
    printf("DONE\n");
    printList();
    return 0;
}*/
