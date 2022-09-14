
class Validator:

    @staticmethod
    def check_result(expected, actual):
        if expected['status_code'] == actual.status_code and expected['non_strict']:
            Validator.__non_strict_compare(expected['json'], actual.json())
        else:
            Validator.__full_compare(expected, actual)

    @staticmethod
    def __non_strict_compare(expected, actual):
        for exp_key, exp_val in expected.items():
            if exp_key in actual and exp_val == actual[f"{exp_key}"]:
                continue
            else:
                Validator.__full_compare(expected, actual)
        return True

    @staticmethod
    def __full_compare(expected, actual):
        assert expected == actual
