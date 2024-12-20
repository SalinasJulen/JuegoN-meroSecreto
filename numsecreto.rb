def juego_numero_secreto
  secreto = rand(1..100)
  intentos = 0
  num_persona = -1
  volver_jugar = true

  while volver_jugar
    puts "Escribe un número del 1 al 100"
    until num_persona == secreto
      num_persona = gets.to_i
      intentos += 1

      if num_persona <= 0
        puts "Escribe un valor superior a 0"
      elsif num_persona > 100
        puts "Escribe un valor inferior a 100"
      elsif secreto > num_persona && num_persona > 0
        puts "¡¡El número es mayor, escribe otro número!!"
      elsif secreto < num_persona && num_persona < 100
        puts "¡¡El número es menor!!, escribe otro número"
      end
    end

    puts "¡¡Has acertado!! Tu cantidad e intentos es #{intentos}. ¿Deseas volver a jugar? Si es así, escribe una 's', si no, escribe una 'n'."
    respuesta = gets.chomp.downcase

    if respuesta == 'n'
      volver_jugar = false
      puts "El juego ha terminado"
    elsif respuesta == 's'
      secreto = rand(1..100)
      intentos = 0
      num_persona = -1
    end
  end
end

juego_numero_secreto
