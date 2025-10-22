import unittest
from payment_function import *

class TestForDispatchRiderApp(unittest.TestCase):
	def test_that_payment_doesnt_take_in_string_input(self):
		actual = payment_new("task")
		expected = "Invalid input!"
		self.assertRaises(TypeError,actual,expected)



	def test_that_payment_works(self):
		actual = payment_new(15)
		expected = 7400
		self.assertEqual(actual,expected)


	def test_that_get_payment_doesnt_take_in_negative_input(self):
		expected = "Invalid input!"
		actual = payment_new(-10)
		self.assertRaises(TypeError,actual,expected)

	
