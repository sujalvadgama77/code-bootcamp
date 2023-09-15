print("Enter Week Number : ");
num = parse(Int,readline(stdin))

if num==1
	print("It's Monday");
elseif num == 2
	print("It's Tuesday");
elseif num == 3
	print("It's Wednesday");
elseif num == 4
	print("It's Thursday");
elseif num == 5
	print("It's Friday");
elseif num == 6
	print("It's Saturday");
elseif num == 7
	print("It's Sunday");
else
	print("Invalid Input!!!\nPlease enter between (1 ~ 7)");
end
