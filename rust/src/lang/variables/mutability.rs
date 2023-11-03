#[cfg(test)]
mod test {
    #[test]
    fn immutable() {
        let num = 12;

        assert_eq!(12, num);
    }

    #[test]
    fn mutable() {
        let mut num = 12;

        assert_eq!(12, num);

        num = 13;

        assert_eq!(13, num);
    }

    #[test]
    fn mut_and_immut_vec() {
        let vec = vec![1, 2, 3];
        let mut nums = Vec::new();

        nums.push(1);

        assert_eq!(1, nums.len());
        assert_eq!(vec![1, 2, 3], vec);
    }
}