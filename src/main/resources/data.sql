TRUNCATE TABLE buses RESTART IDENTITY CASCADE;
TRUNCATE TABLE models RESTART IDENTITY CASCADE;

INSERT INTO models ("name") VALUES
                                        ('Volvo'),
                                        ('Scania'),
                                        ('Fiat');


INSERT INTO buses ("is_active", "created_at", "model_id", "caracteristica", "num", "placa") VALUES
                                                                                                        ('true', '2026-04-28 15:57:33.454849',  1, 'Bus interprovincial, 50 asientos, aire acondicionado', '380', 'ABC-123'),
                                                                                                        ('true', '2026-04-28 15:58:02.374827',  2, 'Bus urbano, 30 asientos, sistema de recaudo electrónico', '381', 'DEF-456'),
                                                                                                        ('true', '2026-04-28 15:58:07.731689',  3, 'Bus turístico, asientos reclinables, WiFi', '382', 'GHI-789'),
                                                                                                        ('true', '2026-04-28 15:58:12.853986',  1, 'Bus interprovincial, doble piso, baño a bordo', '383', 'JKL-321'),
                                                                                                        ('true', '2026-04-28 15:58:16.262554',  2, 'Bus urbano, acceso para discapacitados', '384', 'MNO-654'),
                                                                                                        ('true', '2026-04-28 15:58:20.175478',  3, 'Bus turístico, aire acondicionado, pantalla multimedia', '385', 'PQR-987'),
                                                                                                        ('true', '2026-04-28 15:58:24.349598',  1, 'Bus interprovincial, 45 asientos, GPS integrado', '386', 'STU-147'),
                                                                                                        ('true', '2026-04-28 15:58:29.548899',  2, 'Bus urbano, bajo consumo de combustible', '387', 'VWX-258'),
                                                                                                        ('true', '2026-04-28 15:58:33.470534',  3, 'Bus turístico, iluminación LED interior', '388', 'YZA-369'),
                                                                                                        ('true', '2026-04-28 15:58:36.284845',  1, 'Bus interprovincial, servicio premium, cargadores USB', '389', 'BCD-741'),
                                                                                                        ('true', '2026-04-28 15:58:39.296946',  2, 'Bus urbano, sistema de cámaras de seguridad', '390', 'EFG-852'),
                                                                                                        ('true', '2026-04-28 15:58:42.466117',  3, 'Bus turístico, asientos tipo cama', '391', 'HIJ-963'),
                                                                                                        ('true', '2026-04-28 15:58:46.143902',  1, 'Bus interprovincial, suspensión reforzada', '392', 'KLM-159'),
                                                                                                        ('true', '2026-04-28 15:58:48.93994',  2, 'Bus urbano, puertas automáticas', '393', 'NOP-357'),
                                                                                                        ('true', '2026-04-28 15:58:52.051208',  3, 'Bus turístico, techo panorámico', '394', 'QRS-753');