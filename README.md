{
	"info": {
		"_postman_id": "f560c5ce-99b5-4600-82f8-069f69bdc832",
		"name": "Microservices",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "25767045"
	},
	"item": [
		{
			"name": "UserService",
			"item": [
				{
					"name": "CreateUser",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n \"name\":\"Dinesh Kumar\",\r\n \"email\":\"Dinesh@gmail.com\",\r\n \"about\":\"Tester\"\r\n\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8081/users",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8081",
							"path": [
								"users"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetAllUser",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8081/users",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8081",
							"path": [
								"users"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetAllUserById",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8081/users/1f62b99e-8472-4801-93c1-3bde9bc25111",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8081",
							"path": [
								"users",
								"1f62b99e-8472-4801-93c1-3bde9bc25111"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "HotelService",
			"item": [
				{
					"name": "SaveHotel",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n   \r\n    \"name\":\"Royel Residancy\",\r\n    \"location\":\"Rameshwaram\",\r\n    \"about\":\"Average Hotel\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8082/hotels",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8082",
							"path": [
								"hotels"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetAllHotels",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8082/hotels",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8082",
							"path": [
								"hotels"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetHotelByHotelId",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8082/hotels/41ff8944-47cc-4da1-812c-55059190af42",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8082",
							"path": [
								"hotels",
								"41ff8944-47cc-4da1-812c-55059190af42"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "RatingService",
			"item": [
				{
					"name": "SaveRating",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n   \"rating\":5,\r\n   \"feedback\":\"Good Hotel\",   \r\n   \"userId\":\"4a6749c6-639f-4c19-a6c3-e2fcf86a499f\",\r\n   \"hotelId\":\"41ff8944-47cc-4da1-812c-55059190af42\"\r\n   \r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8083/ratings",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"ratings"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetAllRatings",
					"protocolProfileBehavior": {
						"disableBodyPruning": true
					},
					"request": {
						"method": "GET",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n   \"rating\":5,\r\n   \"feedback\":\"Good Hotel\",   \r\n   \"userId\":\"4a6749c6-639f-4c19-a6c3-e2fcf86a499f\",\r\n   \"hotelId\":\"41ff8944-47cc-4da1-812c-55059190af42\"\r\n   \r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8083/ratings",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"ratings"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetAllRatingsByRatingId",
					"protocolProfileBehavior": {
						"disableBodyPruning": true
					},
					"request": {
						"method": "GET",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n   \"rating\":5,\r\n   \"feedback\":\"Good Hotel\",   \r\n   \"userId\":\"4a6749c6-639f-4c19-a6c3-e2fcf86a499f\",\r\n   \"hotelId\":\"41ff8944-47cc-4da1-812c-55059190af42\"\r\n   \r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8083/ratings/hotels/41ff8944-47cc-4da1-812c-55059190af42",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"ratings",
								"hotels",
								"41ff8944-47cc-4da1-812c-55059190af42"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetAllRatingsByUserId",
					"protocolProfileBehavior": {
						"disableBodyPruning": true
					},
					"request": {
						"method": "GET",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n   \"rating\":5,\r\n   \"feedback\":\"Good Hotel\",   \r\n   \"userId\":\"4a6749c6-639f-4c19-a6c3-e2fcf86a499f\",\r\n   \"hotelId\":\"41ff8944-47cc-4da1-812c-55059190af42\"\r\n   \r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8083/ratings/user/4a6749c6-639f-4c19-a6c3-e2fcf86a499f",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"ratings",
								"user",
								"4a6749c6-639f-4c19-a6c3-e2fcf86a499f"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "API-GATEWAY",
			"item": [
				{
					"name": "GetAllUser",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/users/",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"users",
								""
							]
						}
					},
					"response": []
				},
				{
					"name": "GetUserByUserId",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/users/1f62b99e-8472-4801-93c1-3bde9bc25111",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"users",
								"1f62b99e-8472-4801-93c1-3bde9bc25111"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetAllHotels",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/hotels",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"hotels"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetHotelsByHotelId",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8084/hotels/4ed5ca26-c997-4942-b6af-1293db711873",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"hotels",
								"4ed5ca26-c997-4942-b6af-1293db711873"
							]
						}
					},
					"response": []
				},
				{
					"name": "CreateUser",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n \"name\":\"ramesh Kumar\",\r\n \"email\":\"ramesh@gmail.com\",\r\n \"about\":\"Lead\"\r\n\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8084/users",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8084",
							"path": [
								"users"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetAllRatings",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8083/ratings",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"ratings"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetHotelByRatingsId",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8083/ratings/hotels/41ff8944-47cc-4da1-812c-55059190af42",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"ratings",
								"hotels",
								"41ff8944-47cc-4da1-812c-55059190af42"
							]
						}
					},
					"response": []
				},
				{
					"name": "GetAllRatingByUserId",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8083/ratings/user/4a6749c6-639f-4c19-a6c3-e2fcf86a499f",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"ratings",
								"user",
								"4a6749c6-639f-4c19-a6c3-e2fcf86a499f"
							]
						}
					},
					"response": []
				}
			]
		}
	]
}