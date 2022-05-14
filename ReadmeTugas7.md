Tugas 7 adalah mengeluarkan log error pada Jmeter dengan menggunakan
- url : https://reqres.in
- path : /api/users/2

Data yang diminta yaitu email, first name, lastname dan id
dengan code :
log.error(jsonData.data.email)
log.error(jsonData.data.first_name)
log.error(jsonData.data.last_name)
log.error(jsonData.data.id.toString())
