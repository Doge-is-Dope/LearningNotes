if __name__ == '__main__':
    print("Hello")
    s = "hello"
    s += " world"
    print(s)

    # numeric list
    num_list = [x for x in range(1, 11)]
    print(num_list)
    sqr_nums = [x ** 2 for x in range(1, 11)]
    print(sqr_nums)

    print(sqr_nums[:7])
    print(sqr_nums[7:])

    deep_copy_list = sqr_nums[:]
    shallow_copy_list = sqr_nums
    print("Origin:       " + hex(id(sqr_nums)))
    print("Deep copy:    " + hex(id(deep_copy_list)))
    print("Shallow copy: " + hex(id(shallow_copy_list)))

    d = {1: "Mike", 2: "Mary", 3: "John"}
    print(d)
    d[4] = "Pete"
    print(d[4])
    for k, v in d.items():
        print("K: " + str(k) + ", V: " + v)

    for k in d.keys():
        print("K: " + str(k))

    for v in d.values():
        print("V: " + v)
