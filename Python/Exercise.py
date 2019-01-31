# Write a function called "show_excitement" where the string
# "I am super excited for this course!" is returned exactly
# 5 times, where each sentence is separated by a single space.
# Return the string with "return".
# You can only have the string once in your code.
# Don't just copy/paste it 5 times into a single variable!


def show_excitement():
    # Your code goes here!
    a_lst = []
    for _ in range(5):
        a_lst.append("I am super excited for this course!")
    return " ".join(a_lst)


print(show_excitement())
