def findSmallest(arr): # arr을 매개변수로 받음
    smallest = arr[0] # 가장 작은거 smallest
    smallest_index = 0 # 가장 작은거의 index
    for i in range(1, len(arr)): # arr까지
        if arr[i] < smallest: # smallest보다 arr[i]가 작으면
            smallest = arr[i] # smallest 는 arr[i]
            smallest_index = i # smallest_index도 i
    return smallest_index #가장 작은 index 리턴

def selectionSort(arr): #arr을 매개변수로 받는 selectionSort
    newArr = [] # newArr 리스트 선언
    for i in range(len(arr)): # arr까지
        smallest = findSmallest(arr) # findSmallest 리턴 받음, arr을 인자로 보냄
        newArr.append(arr.pop(smallest)) #  arr의 smallest_index pop 후 newArr에 append
    return newArr # 새로운 list 반환

print(selectionSort([5, 3, 6, 2, 10]))

