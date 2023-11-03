#[cfg(test)]
mod test {
    #[test]
    fn number() {
        let num = 12;

        assert_eq!(12, num);
    }

    #[test]
    fn number_unsigned() {
        let num: u64 = 18989;
        let num2: isize = -3;
        let num3: i32 = -3;

        assert_eq!(18989, num);
        assert_eq!(-3, num2);
        assert_eq!(-3, num3);
    }

    #[test]
    fn number_signed() {
        let num2: isize = -3;
        let num3: i32 = -3;

        assert_eq!(-3, num2);
        assert_eq!(-3, num3);
    }

    #[test]
    fn number_float() {
        let num = 18989.58;
        let num32: f32 = 18989.58;

        assert_eq!(18989.58, num);
        assert_eq!(18989.58, num32);
    }

    #[test]
    fn bool() {
        let b = true;

        assert_eq!(true, b);
    }

    #[test]
    fn string_literal() {
        let text: &str = "william";

        assert_eq!("william", text);
    }

    #[test]
    fn const_string() {
        const TEXT: &str = "william";

        assert_eq!("william", TEXT);
    }
}